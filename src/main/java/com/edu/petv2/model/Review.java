package com.edu.petv2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @OneToOne
    private Account author;

    @OneToOne
    private Account receiver;

    private String content;
}
