package com.CitaMedica.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DiagnosticoDTO {

    // Getters y Setters
    private Long id;
    private String valoracionEspecialista;
    private String enfermedad;

    public DiagnosticoDTO() {
    }

    public DiagnosticoDTO(Long id, String valoracionEspecialista, String enfermedad) {
        this.id = id;
        this.valoracionEspecialista = valoracionEspecialista;
        this.enfermedad = enfermedad;
    }

}
