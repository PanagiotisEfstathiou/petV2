package com.edu.petv2.model;



import com.edu.petv2.controller.OwnerController;
import com.sun.istack.Nullable;
import javax.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "OWNERS")
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

//    private String name;
//    @Column(unique = true)
//    private String mail;
//    private String password;
public Owner (String name, String mail, String password){
    setName(name);
    setMail(mail);
    setPassword(password);
}





}
