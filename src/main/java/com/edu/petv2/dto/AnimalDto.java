package com.edu.petv2.dto;

import com.edu.petv2.model.Animal;
import lombok.*;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class AnimalDto {
    private int age;

    private long id;
    private String name;

    public AnimalDto(Animal animal) {
        this.age = animal.getAge();
        this.name = asAnimal().getName();
    }



    public Animal asAnimal(){
        Animal animal = new Animal();
        animal.setId(id);
        animal.setName(name);
        animal.setAge(age);
        return animal;
    }
}
