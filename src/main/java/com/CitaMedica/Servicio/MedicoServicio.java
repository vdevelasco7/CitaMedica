package com.CitaMedica.Servicio;

import com.CitaMedica.DTO.MedicoDTO;

import java.util.List;

public interface MedicoServicio {
    List<MedicoDTO> listaTodosMedicos();
    MedicoDTO guardarMedico(MedicoDTO medicoDTO);
    MedicoDTO obtenerMedicoPorID(Long id);
    MedicoDTO actualizarMedico(Long id, MedicoDTO medicoDTO);
    void eliminarMedico(Long id);
}
