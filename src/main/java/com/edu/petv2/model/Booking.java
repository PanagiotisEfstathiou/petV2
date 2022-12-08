package com.edu.petv2.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Bookings")
@SequenceGenerator(name = "idGenerator", sequenceName = "Bookings_seq", initialValue = 1, allocationSize = 1)
public class Booking extends BaseModel{

    @ManyToOne()
    private Owner owner;

    @ManyToOne
    private Sitter sitter;

    private Date startingDate;

    private Date endingDate;



}


