package com.edu.petv2.service;

import com.edu.petv2.model.Carer;
import com.edu.petv2.repository.CarerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarerServiceImpl extends BaseServiceImpl<Carer>{
    CarerRepository carerRepository;
    @Override
    public JpaRepository<Carer, Long> getRepository() {
        return carerRepository;
    }
}
