package com.CitaMedica.Servicio;

import com.CitaMedica.DTO.PacienteDTO;

import java.util.List;

public interface PacienteServicio {
    public List<PacienteDTO> listaTodosPacientes();

    public PacienteDTO guardarPaciente(PacienteDTO pacienteDTO);

    public PacienteDTO obtenerPacientePorID(Long id);

    public PacienteDTO actualizarPaciente(Long id, PacienteDTO pacienteDTO);

    public void eliminarPaciente(Long id);
}
