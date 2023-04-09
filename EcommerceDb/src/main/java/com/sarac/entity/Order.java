package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
public class Order extends BasedEntity {

    private BigDecimal paidPrice;
    private BigDecimal totalPrice;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Payment payment;
    @OneToOne
    private Cart cart;

}
