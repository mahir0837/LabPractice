package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Order(BigDecimal paidPrice, BigDecimal totalPrice) {
        this.paidPrice = paidPrice;
        this.totalPrice = totalPrice;
    }
}
