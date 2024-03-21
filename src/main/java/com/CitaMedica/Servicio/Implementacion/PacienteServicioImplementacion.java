package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.Entidad.Usuarios.Paciente;
import com.CitaMedica.Repositorio.PacienteRepositorio;
import com.CitaMedica.Servicio.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicioImplementacion implements PacienteServicio {

    @Autowired
    private PacienteRepositorio repositorio;

    @Override
    public List<Paciente> listaTodosPacientes() {
        return repositorio.findAll();
    }

    @Override
    public Paciente guardarPaciente(Paciente paciente) {
        return repositorio.save(paciente);
    }

    @Override
    public Paciente obtenerPacientePorID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Paciente actualizarPaciente(Paciente paciente) {
        return repositorio.save(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        repositorio.deleteById(id);
    }
}
