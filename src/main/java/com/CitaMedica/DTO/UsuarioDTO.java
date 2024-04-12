package com.CitaMedica.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String clave;

}
