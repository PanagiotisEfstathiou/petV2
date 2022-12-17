package com.edu.petv2.dto;

import com.edu.petv2.model.Owner;
import lombok.*;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class OwnerDto {
    private long id;
    private String name;
    private String mail;
    private String password;

    public OwnerDto(Owner owner) {
        this.id = owner.getId();
        this.name = owner.getName();
        this.mail = owner.getMail();
        this.password = owner.getPassword();
    }

    public Owner asOwner(){
        Owner owner = new Owner();
        owner.setId(id);
        owner.setName(name);
        owner.setMail(mail);
        owner.setPassword(password);
        return owner;
    }
}
