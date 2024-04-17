package com.CitaMedica.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PacienteDTO extends UsuarioDTO{

    //@NotBlank(message = "El NSS es obligatorio")
    private String NSS;
    //@NotBlank(message = "El número de tarjeta es obligatorio")
    private String numTarjeta;
    //@NotBlank(message = "El telefono es obligatorio")
    private String telefono;
    //@NotBlank(message = "La dirección es obligatoria")
    private String direccion;

}
