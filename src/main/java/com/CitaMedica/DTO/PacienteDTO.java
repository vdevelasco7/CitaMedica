package com.CitaMedica.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PacienteDTO {

    // Getters y Setters
    private Long id;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String NSS;
    private String numTarjeta;
    private String telefono;
    private String direccion;

    public PacienteDTO() {
    }

    public PacienteDTO(Long id, String nombre, String apellidos, String usuario, String NSS, String numTarjeta, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.NSS = NSS;
        this.numTarjeta = numTarjeta;
        this.telefono = telefono;
        this.direccion = direccion;
    }

}
