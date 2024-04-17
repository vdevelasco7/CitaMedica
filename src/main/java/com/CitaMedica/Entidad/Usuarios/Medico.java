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
@Table(name = "Medicos")
@AllArgsConstructor
@NoArgsConstructor
public class Medico extends Usuario {

    //@Column(name = "NumColegiado", nullable = false, unique = true)
    private String numColegiado;

    /*
    @OneToMany(mappedBy = "medico", cascade = CascadeType.ALL)
    private List<Cita> citas;
     */
}
