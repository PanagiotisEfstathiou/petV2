package com.edu.petv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Carer  extends Account{
    private boolean available;

    @OneToMany(mappedBy = "carer")
    private List<Booking> bookingHistory;

    @OneToMany(mappedBy = "carer")
    private List<Animal> currentlyHosting;

}

