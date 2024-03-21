package com.CitaMedica.Servicio;

import com.CitaMedica.Entidad.Usuarios.Medico;

import java.util.List;

public interface MedicoServicio {
    public List<Medico> listaTodosMedicos();

    public Medico guardarMedico(Medico medico);

    public Medico obtenerMedicoPorID(Long id);

    public Medico actualizarMedico(Medico medico);

    public void eliminarMedico(Long id);
}
