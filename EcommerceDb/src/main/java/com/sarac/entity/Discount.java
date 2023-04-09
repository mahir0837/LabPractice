package com.sarac.entity;

import com.sarac.enums.DiscountType;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
public class Discount extends BasedEntity{
    private String name;
    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}
