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

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nombre, String apellidos, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.clave = clave;
    }

}
