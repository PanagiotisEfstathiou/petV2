package com.edu.petv2.service;

import com.edu.petv2.dto.*;
import com.edu.petv2.model.Review;
import java.awt.print.Book;
import org.springframework.stereotype.Service;

@Service
public interface AppService {
public OwnerDto createOwner(OwnerDto ownerDto);

public AnimalDto createAnimal(long ownerId, AnimalDto animalDto );

SitterDto createSitter(SitterDto sitterDto);

ReviewDto writeReview(long ownerId,  ReviewDto reviewDto, long sitterId);

BookingDto makeABooking(long ownerId, long sitterId, BookingDto bookingDto);

}
