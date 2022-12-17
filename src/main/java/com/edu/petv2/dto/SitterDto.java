package com.edu.petv2.dto;

import com.edu.petv2.model.Owner;
import com.edu.petv2.model.Sitter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SitterDto {
    private Long id;
    private String name;
    private String mail;
    private String password;
    private Boolean available;

    public SitterDto(Sitter sitter) {
        this.id = sitter.getId();
        this.name = sitter.getName();
        this.mail = sitter.getMail();
        this.password = sitter.getPassword();
        this.available = sitter.isAvailable();
    }

    public Sitter asSitter(){
        Sitter sitter = new Sitter();
        sitter.setId(id);
        sitter.setName(name);
        sitter.setMail(mail);
        sitter.setPassword(password);
        sitter.setAvailable(available);
        return sitter;
    }

}
