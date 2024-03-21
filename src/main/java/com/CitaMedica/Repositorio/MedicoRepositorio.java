package com.CitaMedica.Repositorio;

import com.CitaMedica.Entidad.Usuarios.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, Long>{
}
