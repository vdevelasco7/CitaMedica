package com.CitaMedica.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CitaDTO {

    // Getters y Setters
    private Long id;
    private Date fechaHora;
    private String motivoCita;
    private int attribute11;

    public CitaDTO() {
    }

    public CitaDTO(Long id, Date fechaHora, String motivoCita, int attribute11) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.motivoCita = motivoCita;
        this.attribute11 = attribute11;
    }

}
