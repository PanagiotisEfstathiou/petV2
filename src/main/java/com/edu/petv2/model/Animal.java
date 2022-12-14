package com.edu.petv2.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Animals")
@SequenceGenerator(name = "idGenerator", sequenceName = "Animal_Seq", initialValue = 1, allocationSize = 1)
public class Animal extends BaseModel {

    private String name;
    private int age;
    @ManyToOne
    private Owner owner;




}
