package com.ap.SpringBoot.controller;

import com.ap.SpringBoot.models.Experiencia;
import com.ap.SpringBoot.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("experiencia")
public class ExperienciaController {
    private ExperienciaService experienciaService;

    @Autowired
    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @PostMapping("/save")
    public Experiencia newExperiencia(@RequestBody Experiencia experiencia){
        return experienciaService.addExperiencia(experiencia);
    }

    @GetMapping("/findAll")
    public List<Experiencia> findAllExperiencia(){
        return experienciaService.buscarExperiencia();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        experienciaService.borrarExperiencia(id);
    }

    @PostMapping("/editar")
    public Experiencia editExperiencia(@RequestBody Experiencia experiencia){
        return experienciaService.addExperiencia(experiencia);
    }
}
