package com.ap.SpringBoot.repository;

import com.ap.SpringBoot.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long> {
}
