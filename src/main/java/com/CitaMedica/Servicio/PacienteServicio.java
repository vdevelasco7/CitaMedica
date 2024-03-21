package com.CitaMedica.Servicio;

import com.CitaMedica.Entidad.Usuarios.Medico;
import com.CitaMedica.Entidad.Usuarios.Paciente;

import java.util.List;

public interface PacienteServicio {
    public List<Paciente> listaTodosPacientes();

    public Paciente guardarPaciente(Paciente paciente);

    public Paciente obtenerPacientePorID(Long id);

    public Paciente actualizarPaciente(Paciente paciente);

    public void eliminarPaciente(Long id);
}
