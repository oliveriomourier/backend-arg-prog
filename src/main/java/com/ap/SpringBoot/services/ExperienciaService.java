package com.ap.SpringBoot.services;

import com.ap.SpringBoot.models.Educacion;
import com.ap.SpringBoot.models.Experiencia;
import com.ap.SpringBoot.repository.EducacionRepo;
import com.ap.SpringBoot.repository.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;

    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }

    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia) ;
    }

    public List<Experiencia> buscarExperiencia(){
        return experienciaRepo.findAll();
    }

    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}
