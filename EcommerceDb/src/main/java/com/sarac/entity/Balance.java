package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
public class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private BigDecimal amount;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Balance(BigDecimal amount) {
        this.amount = amount;
    }
}
