package com.CitaMedica.Entidad.Citas;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fechaHora;
    private String motivoCita;
    private int attribute;


    public String getMotivoCita() {
        return this.motivoCita;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCita = motivoCita;
    }

    public int getAttribute() {
        return this.attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}