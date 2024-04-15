package com.CitaMedica.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioDTO {
    @NotNull
    private String nombre;
    @NotNull
    private String apellidos;
    @NotNull
    private String usuario;
    @NotNull
    private String clave;

}
