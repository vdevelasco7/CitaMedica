package com.CitaMedica.Entidad.Usuarios;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Paciente extends Usuario {

    private String NSS;
    private String numTarjeta;
    private String telefono;
    private String direccion;

    public Paciente() {
        super();
    }

    public Paciente(String nombre, String apellidos, String usuario, String clave, String NSS, String numTarjeta, String telefono, String direccion) {
        super(nombre, apellidos, usuario, clave);
        this.NSS = NSS;
        this.numTarjeta = numTarjeta;
        this.telefono = telefono;
        this.direccion = direccion;
    }

}