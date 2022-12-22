package com.edu.petv2.repository;

import com.edu.petv2.dto.SitterDto;
import com.edu.petv2.model.Sitter;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SitterRepository extends JpaRepository<Sitter,Long> {
    @Query("select o from Sitter o where o.petsAllowed = :petsAllowed")
    List<Sitter> getSitterBy(@Param("petsAllowed") String petsAllowed);
}
