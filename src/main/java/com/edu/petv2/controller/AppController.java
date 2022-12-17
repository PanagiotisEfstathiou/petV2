package com.edu.petv2.controller;


import com.edu.petv2.dto.AnimalDto;
import com.edu.petv2.dto.OwnerDto;
import com.edu.petv2.service.AppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
public class AppController {

    private final AppService appService;

    @PostMapping("/newOwner")
    public OwnerDto createOwner(@RequestBody OwnerDto ownerDto) {
      return appService.createOwner(ownerDto);
    }

    @PostMapping("/newPet/{ownerId}")
    public AnimalDto createAnimal(@PathVariable(name="ownerId") long ownerId, @RequestBody AnimalDto animalDto){
        return appService.createAnimal(ownerId, animalDto);
    }

    //Body:
    //    {
    //        "name" : "alpha",
    //            "mail" : "pass1",
    //            "password" : "asdf"
    //    }




}
