package com.edu.petv2.dto;

import com.edu.petv2.model.Booking;
import java.util.Date;
import lombok.*;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class BookingDto {
    private long id;
    
    private Date startingDate;
    private Date endingDate;

    public BookingDto(Booking booking) {
        this.id = booking.getId();
        this.startingDate = booking.getStartingDate();
        this.endingDate = booking.getEndingDate();
    }

    public Booking asBooking(){
        Booking booking = new Booking();
        booking.setId(id);
        booking.setStartingDate(startingDate);
        booking.setEndingDate(endingDate);
        return booking;
    }
}
