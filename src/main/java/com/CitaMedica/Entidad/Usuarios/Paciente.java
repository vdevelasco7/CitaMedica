package com.CitaMedica.Entidad.Usuarios;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Paciente extends Usuario {

    private String NSS;
    private String numTarjeta;
    private String telefono;
    private String direccion;

}