package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Address extends BasedEntity {
    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    private Customer customer;

}
