package com.CitaMedica.Repositorio;

import com.CitaMedica.Entidad.Diagnosticos.Diagnostico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticoRepositorio extends JpaRepository<Diagnostico, Long>{
}
