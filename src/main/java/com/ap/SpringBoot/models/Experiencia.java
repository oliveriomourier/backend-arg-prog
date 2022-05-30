package com.ap.SpringBoot.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String títuloExp;
    private int fechaExp;
    private String descExp;
    private String ImagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String títuloExp, int fechaExp, String descExp, String imagenExp) {
        this.idExp = idExp;
        this.títuloExp = títuloExp;
        this.fechaExp = fechaExp;
        this.descExp = descExp;
        this.ImagenExp = imagenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTítuloExp() {
        return títuloExp;
    }

    public void setTítuloExp(String títuloExp) {
        this.títuloExp = títuloExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImagenExp() {
        return ImagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.ImagenExp = imagenExp;
    }
}
