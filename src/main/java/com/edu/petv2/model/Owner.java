package com.edu.petv2.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Owner extends BaseModel{

//    @OneToMany(mappedBy = "owner")
//    @Nullable
//    @ToString.Exclude
//    private List<Animal> petsOwned;
//
//    @OneToMany(mappedBy = "owner")
//    @ToString.Exclude
//    @Nullable
//    private List<Booking> bookingHistory;

    private String name;
    @Column(unique = true)
    private String mail;
    private String password;



}
