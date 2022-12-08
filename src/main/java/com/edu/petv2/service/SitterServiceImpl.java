package com.edu.petv2.service;

import com.edu.petv2.model.Sitter;
import com.edu.petv2.repository.SitterRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SitterServiceImpl extends BaseServiceImpl<Sitter> implements SitterService{
    SitterRepository sitterRepository;
    @Override
    public JpaRepository<Sitter, Long> getRepository() {
        return sitterRepository;
    }
}
