package com.edu.petv2.repository;

import com.edu.petv2.model.Sitter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SitterRepository extends JpaRepository<Sitter,Long> {
}
