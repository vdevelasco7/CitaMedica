package com.CitaMedica.Entidad.Usuarios;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Usuarios")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "Apellidos", nullable = false, length = 50)
    private String apellidos;
    @Column(name = "Usuario", nullable = false, length = 50, unique = true)
    private String usuario;
    @Column(name = "Clave", nullable = false, length = 50)
    private String clave;

}
