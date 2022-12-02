package com.edu.petv2.service;

import com.edu.petv2.model.Owner;
import com.edu.petv2.repository.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OwnerServiceImpl extends BaseServiceImpl<Owner>{

    private OwnerRepository ownerRepository;

    @Override
    public JpaRepository<Owner, Long> getRepository() {
        return ownerRepository;
    }
}
