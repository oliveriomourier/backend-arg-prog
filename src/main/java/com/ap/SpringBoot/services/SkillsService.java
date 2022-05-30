package com.ap.SpringBoot.services;

import com.ap.SpringBoot.models.Educacion;
import com.ap.SpringBoot.models.Skills;
import com.ap.SpringBoot.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {
    private SkillsRepo skillsRepo;

    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }

    public Skills addSkill(Skills skills){
        return skillsRepo.save(skills) ;
    }

    public List<Skills> buscarSkill(){
        return skillsRepo.findAll();
    }

    public void borrarSkill(Long id){
        skillsRepo.deleteById(id);
    }
}
