package com.sarac.entity;

import com.sarac.enums.PaymentMethod;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
public class Payment extends BasedEntity {
    private BigDecimal paidPrice;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
}
