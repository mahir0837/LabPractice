package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
public class Balance extends BasedEntity {

    private BigDecimal amount;
    @OneToOne
    private Customer customer;
}
