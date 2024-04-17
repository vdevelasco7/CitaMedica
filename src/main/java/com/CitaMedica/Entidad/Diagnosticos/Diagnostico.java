package com.CitaMedica.Entidad.Diagnosticos;

import com.CitaMedica.Entidad.Citas.Cita;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Diagnosticos")
@AllArgsConstructor
@NoArgsConstructor
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@Column(name = "ValoracionEspecialista")
    private String valoracionEspecialista;
    //@Column(name = "Enfermedad")
    private String enfermedad;

    /*
    @OneToOne(mappedBy = "diagnostico", cascade = CascadeType.ALL)
    private Cita cita;
     */
}
