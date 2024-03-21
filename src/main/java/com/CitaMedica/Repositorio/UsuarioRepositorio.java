package com.CitaMedica.Repositorio;

import com.CitaMedica.Entidad.Usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
}
