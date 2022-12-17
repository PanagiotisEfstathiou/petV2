package com.edu.petv2.model;

import javax.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@MappedSuperclass
@NoArgsConstructor
@Data
@EqualsAndHashCode
public abstract class Account extends BaseModel {

    private String name;
    @Column(unique = true)
    private String mail;
    private String password;


}
