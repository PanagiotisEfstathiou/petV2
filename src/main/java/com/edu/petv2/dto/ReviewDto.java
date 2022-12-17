package com.edu.petv2.dto;


import com.edu.petv2.model.Review;
import java.util.Date;
import lombok.*;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class ReviewDto {
    private long id;
    private String content;
    private Date date;
    
     public ReviewDto(Review review) {
            this.id = review.getId();
            this.content = review.getContent();
            this.date = review.getDate();
        }
        
     public Review asReview(){
     Review review = new Review();
     review.setId(id);
     review.setContent(content);
     review.setDate(date);
     return review;
     }
}
