package com.edu.petv2.model;

import jakarta.persistence.*;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name = "idGenerator", sequenceName = "Review_seq", initialValue = 1, allocationSize = 1)
public class Review extends BaseModel{
    @OneToOne
    @JoinColumn(name = "author_id")
    private Owner author;

    @OneToOne
    @JoinColumn(name = "receiver_id")
    private Sitter receiver;

    private String content;

    private Date date;
}
