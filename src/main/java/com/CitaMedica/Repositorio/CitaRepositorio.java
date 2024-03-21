package com.CitaMedica.Repositorio;

import com.CitaMedica.Entidad.Citas.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepositorio extends JpaRepository<Cita, Long>{
}
