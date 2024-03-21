package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.Entidad.Diagnosticos.Diagnostico;
import com.CitaMedica.Entidad.Usuarios.Paciente;
import com.CitaMedica.Repositorio.DiagnosticoRepositorio;
import com.CitaMedica.Servicio.DiagnosticoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticoServicioImplementacion implements DiagnosticoServicio {

    @Autowired
    private DiagnosticoRepositorio repositorio;

    @Override
    public List<Diagnostico> listaTodosDiagnosticos() {
        return repositorio.findAll();
    }

    @Override
    public Diagnostico guardarDiagnostico(Diagnostico diagnostico) {
        return repositorio.save(diagnostico);
    }

    @Override
    public Diagnostico obtenerDiagnosticoPorID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Diagnostico actualizarDiagnostico(Diagnostico diagnostico) {
        return repositorio.save(diagnostico);
    }

    @Override
    public void eliminarDiagnostico(Long id) {
        repositorio.deleteById(id);
    }
}
