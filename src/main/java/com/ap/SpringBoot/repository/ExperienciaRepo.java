package com.ap.SpringBoot.repository;

import com.ap.SpringBoot.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepo extends JpaRepository<Experiencia,Long> {
}
