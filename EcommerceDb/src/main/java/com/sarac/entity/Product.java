package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product extends BasedEntity {

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer RemainingQuantity;

    @ManyToMany
    @JoinTable(name = "ProductCategoryRel",
               joinColumns=@JoinColumn(name = "p_id"),
               inverseJoinColumns=@JoinColumn(name = "c_id"))
    private List<Category> categoryList;


}
