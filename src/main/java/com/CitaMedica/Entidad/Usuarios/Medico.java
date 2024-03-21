package com.CitaMedica.Entidad.Usuarios;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Medico extends Usuario {

    private String numColegiado;

    public Medico() {
        super();
    }

    public Medico(String nombre, String apellidos, String usuario, String clave, String numColegiado) {
        super(nombre, apellidos, usuario, clave);
        this.numColegiado = numColegiado;
    }

}
