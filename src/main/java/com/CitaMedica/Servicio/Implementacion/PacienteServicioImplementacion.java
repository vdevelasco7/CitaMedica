package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.DTO.PacienteDTO;
import com.CitaMedica.Entidad.Usuarios.Paciente;
import com.CitaMedica.Repositorio.PacienteRepositorio;
import com.CitaMedica.Servicio.PacienteServicio;
import com.CitaMedica.exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PacienteServicioImplementacion implements PacienteServicio {

    @Autowired
    private PacienteRepositorio repositorio;

    @Override
    public List<PacienteDTO> listaTodosPacientes() {
        List<Paciente> pacientes = repositorio.findAll();
        return pacientes.stream().map(this::convertirAPacienteDTO).collect(Collectors.toList());
    }

    @Override
    public PacienteDTO guardarPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = convertirAPaciente(pacienteDTO);
        Paciente pacienteGuardado = repositorio.save(paciente);
        return convertirAPacienteDTO(pacienteGuardado);
    }

    @Override
    public PacienteDTO obtenerPacientePorID(Long id) {
        Paciente paciente = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        return convertirAPacienteDTO(paciente);
    }

    @Override
    public PacienteDTO actualizarPaciente(Long id, PacienteDTO pacienteDTO) {
        Paciente pacienteExistente = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        if (pacienteExistente != null) {
            BeanUtils.copyProperties(pacienteDTO, pacienteExistente, "id");
            Paciente pacienteActualizado = repositorio.save(pacienteExistente);
            return convertirAPacienteDTO(pacienteActualizado);
        }
        return null;
    }

    @Override
    public void eliminarPaciente(Long id) {
        Paciente paciente = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        repositorio.delete(paciente);
    }

    private PacienteDTO convertirAPacienteDTO(Paciente paciente) {
        PacienteDTO pacienteDTO = new PacienteDTO();
        if (paciente != null) {
            BeanUtils.copyProperties(paciente, pacienteDTO);
        }
        return pacienteDTO;
    }

    private Paciente convertirAPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = new Paciente();
        BeanUtils.copyProperties(pacienteDTO, paciente);
        return paciente;
    }
}
