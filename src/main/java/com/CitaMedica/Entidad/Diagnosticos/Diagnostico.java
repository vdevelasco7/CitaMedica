package com.CitaMedica.Entidad.Diagnosticos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String valoracionEspecialista;
    private String enfermedad;


    public String getValoracionEspecialista() {
        return this.valoracionEspecialista;
    }

    public void setValoracionEspecialista(String valoracionEspecialista) {
        this.valoracionEspecialista = valoracionEspecialista;
    }

    public String getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
