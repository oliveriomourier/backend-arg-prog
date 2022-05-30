package com.ap.SpringBoot.controller;

import com.ap.SpringBoot.models.Skills;
import com.ap.SpringBoot.services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {
    private SkillsService skillsService;

    @Autowired
    public SkillController(SkillsService skillsService) {
        this.skillsService = skillsService;
    }

    @PostMapping("/save")
    public Skills newSkill(@RequestBody Skills skills){
        return skillsService.addSkill(skills);
    }

    @GetMapping("/findAll")
    public List<Skills> findAllSkills(){
        return skillsService.buscarSkill();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillsService.borrarSkill(id);
    }

    @PutMapping("/edit")
    public Skills editSkill(@RequestBody Skills skills){
        return skillsService.addSkill(skills);
    }
}
