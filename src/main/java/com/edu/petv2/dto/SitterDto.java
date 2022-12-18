package com.edu.petv2.dto;

import com.edu.petv2.model.Owner;
import com.edu.petv2.model.Sitter;
import lombok.*;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class SitterDto {
    private long id;
    private String name;
    private String mail;
    private String password;


    public SitterDto(Sitter sitter) {
        this.id = sitter.getId();
        this.name = sitter.getName();
        this.mail = sitter.getMail();
        this.password = sitter.getPassword();
    }

    public Sitter asSitter(){
        Sitter sitter = new Sitter();
        sitter.setId(id);
        sitter.setName(name);
        sitter.setMail(mail);
        sitter.setPassword(password);
        return sitter;
    }

}
