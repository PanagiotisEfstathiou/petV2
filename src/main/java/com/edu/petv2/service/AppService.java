package com.edu.petv2.service;

import com.edu.petv2.dto.AnimalDto;
import com.edu.petv2.dto.OwnerDto;
import org.springframework.stereotype.Service;

@Service
public interface AppService {
public OwnerDto createOwner(OwnerDto ownerDto);

public AnimalDto createAnimal(long ownerId, AnimalDto animalDto );
}
