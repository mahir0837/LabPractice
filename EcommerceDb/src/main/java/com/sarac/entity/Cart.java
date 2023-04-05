package com.sarac.entity;

import com.sarac.enums.CartState;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Enumerated(EnumType.STRING)
    private CartState cartState;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne(mappedBy = "cart")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;
    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItem;
    public Cart(CartState cartState) {
        this.cartState = cartState;
    }
}
