package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer RemainingQuantity;

    @ManyToMany
    @JoinTable(name = "ProductCategoryRel",
    joinColumns=@JoinColumn(name = "p_id"),
    inverseJoinColumns=@JoinColumn(name = "c_id"))
    private List<Category> categoryList;
    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItem;

    public Product(String name, BigDecimal price, Integer remainingQuantity) {
        this.name = name;
        this.price = price;
        RemainingQuantity = remainingQuantity;
    }
}
