package com.ap.SpringBoot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String títuloEdu;
    private int fechaEdu;
    private String descEdu;
    private String ImagenEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String títuloEdu, int fechaEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.títuloEdu = títuloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        ImagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTítuloEdu() {
        return títuloEdu;
    }

    public void setTítuloEdu(String títuloEdu) {
        this.títuloEdu = títuloEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return ImagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.ImagenEdu = imagenEdu;
    }
}

