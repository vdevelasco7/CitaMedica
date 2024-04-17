package com.CitaMedica.Entidad.Usuarios;

import com.CitaMedica.Entidad.Citas.Cita;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "Pacientes")
@AllArgsConstructor
@NoArgsConstructor
public class Paciente extends Usuario {

    //@Column(name = "NSS", nullable = false, unique = true)
    private String NSS;
    //@Column(name = "NumTarjeta", nullable = false)
    private String numTarjeta;
    //@Column(name = "Telefono", nullable = false)
    private String telefono;
    //@Column(name = "Direccion", nullable = false)
    private String direccion;

    /*
    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Cita> citas;
    */
}