package com.edu.petv2.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
@SequenceGenerator(name = "idGenerator", sequenceName = "Owners_seq", initialValue = 1, allocationSize = 1)
public class Owner extends Account{

    @OneToMany(mappedBy = "owner")
    @Nullable
    @ToString.Exclude
    private List<Animal> petsOwned;

    @OneToMany(mappedBy = "owner")
    @ToString.Exclude
    @Nullable
    private List<Booking> bookingHistory;

    public Owner(String name, String password, String email){
        setName(name);
        setPassword(password);
        setMail(email);
    }






}
