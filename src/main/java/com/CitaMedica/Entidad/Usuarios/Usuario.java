package com.CitaMedica.Entidad.Usuarios;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Usuarios")
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

    public Usuario(){
    }

    public Usuario(Long id, String nombre, String apellidos, String usuario, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Usuario(String nombre, String apellidos, String usuario, String clave) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.clave = clave;
    }

}
