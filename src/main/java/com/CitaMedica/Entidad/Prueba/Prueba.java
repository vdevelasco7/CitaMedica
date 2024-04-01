package com.CitaMedica.Entidad.Prueba;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Prueba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date fechaHoraP;
    @Column
    private String motivoCitaP;
    private int attributeP;


    public String getMotivoCita() {
        return this.motivoCitaP;
    }

    public void setMotivoCita(String motivoCita) {
        this.motivoCitaP = motivoCita;
    }

    public int getAttribute() {
        return this.attributeP;
    }

    public void setAttribute(int attribute) {
        this.attributeP = attribute;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}