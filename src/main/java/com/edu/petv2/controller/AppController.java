package com.edu.petv2.controller;


import com.edu.petv2.dto.*;
import com.edu.petv2.exception.AccountCreationException;
import com.edu.petv2.exception.BookingCreationException;
import com.edu.petv2.service.AppService;
import java.util.List;
import lombok.Getter;
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

    @PostMapping("/newSitter")
    public SitterDto createSitter(@RequestBody SitterDto sitterDto){return appService.createSitter(sitterDto);}

    //Body:
    //    {
    //        "name" : "alpha",
    //            "mail" : "pass1",
    //            "password" : "asdf"
    //    }

    @PostMapping("/newRev/{ownerId}/{sitterId}")
    public ReviewDto writeReview(@PathVariable(name = "ownerId") long ownerId, @PathVariable(name = "sitterId") long sitterId , @RequestBody ReviewDto reviewDto){
        return appService.writeReview(ownerId , reviewDto, sitterId);
    }

    @PostMapping("/newBooking/{ownerId}/{sitterId}")
    public BookingDto book(@PathVariable(name = "ownerId") long ownerId, @PathVariable(name = "sitterId") long sitterId , @RequestBody BookingDto bookingDto) throws BookingCreationException {
        return appService.makeABooking(ownerId , sitterId, bookingDto);
    }

    @GetMapping("/sitterByPet/{petsAllowed}")
    public List<SitterDto> sitterByPet(@PathVariable(name = "petsAllowed") String petsA){
        return appService.findSitterByPet(petsA);
    }

    @GetMapping("owner/{id}")
    public OwnerDto getOwnerById(@PathVariable(name= "id") long id){
        return appService.getOwnerById(id);
    }

    @GetMapping("sitter/{id}")
    public SitterDto getSitterById(@PathVariable(name = "id") long id){
        return appService.getSitterById(id);
    }


}
