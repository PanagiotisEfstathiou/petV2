package com.edu.petv2.repository;

import com.edu.petv2.model.Carer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarerRepository extends JpaRepository<Carer,Long> {
}
