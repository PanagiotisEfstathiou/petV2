package com.edu.petv2.dto;

import com.edu.petv2.model.Booking;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BookingDto {
    private Long id;
    private String content;
    
    private Date startingDate;
    private Date endingDate;

    public BookingDto(Booking booking) {
        this.id = booking.getId();
        this.content = booking.getContent();
        this.startingDate = booking.getStartingDate();
        this.endingDate = booking.getEndingDate();
    }

    public Booking asBooking(){
        Booking booking = new Booking();
        booking.setId(id);
        booking.setContent(content);
        booking.setStartingDate(startingDate);
        booking.setEndingDate(endingDate);
        return booking;
    }
}
