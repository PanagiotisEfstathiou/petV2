package com.edu.petv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
    private boolean available;

    @OneToMany(mappedBy = "sitter")
    private List<Booking> bookingHistory;

    @OneToMany
    private List<Animal> currentlyHosting;

}

