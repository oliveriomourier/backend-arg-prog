package com.ap.SpringBoot.controller;

import com.ap.SpringBoot.models.Educacion;
import com.ap.SpringBoot.services.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
    private EducacionService educacionService;

    @Autowired
    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @PostMapping("/save")
    public Educacion newEducacion(@RequestBody Educacion educacion){
        return educacionService.addEducation(educacion);
    }

    @GetMapping("/findAll")
    public List<Educacion> findAllEducacion(){
        return educacionService.buscarEducaciones();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEducacion(@PathVariable Long id){
        educacionService.borrarEducacion(id);
    }

    @PostMapping("/edit")
    public Educacion editEducacion(@RequestBody Educacion educacion){
        return educacionService.addEducation(educacion);
    }
}
