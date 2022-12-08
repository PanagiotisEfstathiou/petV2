package com.edu.petv2.service;

import com.edu.petv2.model.Owner;
import com.edu.petv2.repository.OwnerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OwnerServiceImpl extends BaseServiceImpl<Owner> implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public JpaRepository<Owner, Long> getRepository() {
        return ownerRepository;
    }
}
