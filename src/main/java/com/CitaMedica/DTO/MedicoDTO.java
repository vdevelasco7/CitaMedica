package com.CitaMedica.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MedicoDTO {

    // Getters y Setters
    private Long id;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String numColegiado;

    public MedicoDTO() {
    }

    public MedicoDTO(Long id, String nombre, String apellidos, String usuario, String numColegiado) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.numColegiado = numColegiado;
    }

}
