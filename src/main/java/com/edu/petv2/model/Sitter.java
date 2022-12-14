package com.edu.petv2.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@SequenceGenerator(name = "idGenerator", sequenceName = "Sitter_seq", initialValue = 1, allocationSize = 1)
public class Sitter extends Account{

    @OneToMany(mappedBy = "sitter")
    private List<Booking> bookingHistory;

    @OneToMany
    private List<Animal> currentlyHosting;


    private String petsAllowed;

}

