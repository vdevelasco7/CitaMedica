package com.CitaMedica.Entidad.Citas;

import com.CitaMedica.Entidad.Diagnosticos.Diagnostico;
import com.CitaMedica.Entidad.Usuarios.Medico;
import com.CitaMedica.Entidad.Usuarios.Paciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@Entity
@Table(name = "Citas")
@AllArgsConstructor
@NoArgsConstructor
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@Column(name = "FechaHora", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaHora;
    //@Column(name = "MotivoCita", nullable = false)
    private String motivoCita;
    //@Column(name = "Attribute11", nullable = false)
    private int attribute11;

    /*
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @OneToOne(mappedBy = "cita", cascade = CascadeType.ALL)
    private Diagnostico diagnostico;
     */

}