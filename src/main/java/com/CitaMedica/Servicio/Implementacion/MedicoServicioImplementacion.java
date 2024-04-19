package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.DTO.MedicoDTO;
import com.CitaMedica.Entidad.Usuarios.Medico;
import com.CitaMedica.Repositorio.MedicoRepositorio;
import com.CitaMedica.Servicio.MedicoServicio;
import com.CitaMedica.exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MedicoServicioImplementacion implements MedicoServicio {

    @Autowired
    private MedicoRepositorio repositorio;

    @Override
    public List<MedicoDTO> listaTodosMedicos() {
        List<Medico> medicos = repositorio.findAll();
        return medicos.stream().map(this::convertirAMedicoDTO).collect(Collectors.toList());
    }

    @Override
    public MedicoDTO guardarMedico(MedicoDTO medicoDTO) {
        Medico medico = convertirAMedico(medicoDTO);
        Medico medicoGuardado = repositorio.save(medico);
        return convertirAMedicoDTO(medicoGuardado);
    }

    @Override
    public MedicoDTO obtenerMedicoPorID(Long id) {
        Medico medico = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        return convertirAMedicoDTO(medico);
    }

    @Override
    public MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDTO) {
        Medico medicoExistente = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        if (medicoExistente != null) {
            BeanUtils.copyProperties(medicoDTO, medicoExistente, "id");
            Medico medicoActualizado = repositorio.save(medicoExistente);
            return convertirAMedicoDTO(medicoActualizado);
        }
        return null;
    }

    @Override
    public void eliminarMedico(Long id) {
        Medico medico = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        repositorio.delete(medico);
    }

    private MedicoDTO convertirAMedicoDTO(Medico medico) {
        MedicoDTO medicoDTO = new MedicoDTO();
        if (medico != null) {
            BeanUtils.copyProperties(medico, medicoDTO);
        }
        return medicoDTO;
    }

    private Medico convertirAMedico(MedicoDTO medicoDTO) {
        Medico medico = new Medico();
        BeanUtils.copyProperties(medicoDTO, medico);
        return medico;
    }
}
