package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Customer extends BasedEntity {

    private String email;
    private String firstName;
    private String lastName;
    private String userName;
}
