package com.edu.petv2.service;

import com.edu.petv2.dto.AnimalDto;
import com.edu.petv2.dto.OwnerDto;
import com.edu.petv2.dto.SitterDto;
import com.edu.petv2.model.Animal;
import com.edu.petv2.model.Sitter;
import com.edu.petv2.repository.AnimalRepository;
import com.edu.petv2.model.Owner;
import com.edu.petv2.repository.OwnerRepository;
import com.edu.petv2.repository.SitterRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppServiceImpl implements AppService {

    @Autowired
    private OwnerRepository ownerRepository;
    private final AnimalRepository animalRepository;

    @Autowired
    private SitterRepository sitterRepository;

    @Override
    public OwnerDto createOwner(OwnerDto ownerDto) {
        Owner owner = ownerDto.asOwner();
        ownerRepository.save(owner);
        return new OwnerDto(owner);
    }

    public AnimalDto createAnimal(long ownerId,  AnimalDto animalDto){
        Optional<Owner> ownerOptional = ownerRepository.findById(ownerId);
        Animal animal = new Animal();
        animal.setOwner(ownerOptional.get());
        animal.setName(animalDto.getName());
        animal.setAge(animalDto.getAge());
        animalRepository.save(animal);
        return new AnimalDto(animal);
    }

    public SitterDto createSitter(long id, SitterDto sitterDto){
        Sitter sitter = sitterDto.asSitter();
        sitterRepository.save(sitter);
        return new SitterDto(sitter);
    }
}
