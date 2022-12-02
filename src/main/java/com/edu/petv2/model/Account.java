package com.edu.petv2.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Account extends BaseModel {

    private String name;
    @Column(unique = true)
    private String mail;
    private String password;


}
