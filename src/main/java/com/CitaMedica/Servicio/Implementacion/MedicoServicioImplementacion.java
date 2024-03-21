package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.Entidad.Usuarios.Medico;
import com.CitaMedica.Repositorio.MedicoRepositorio;
import com.CitaMedica.Servicio.MedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicioImplementacion implements MedicoServicio {

    @Autowired
    private MedicoRepositorio repositorio;

    @Override
    public List<Medico> listaTodosMedicos() {
        return repositorio.findAll();
    }

    @Override
    public Medico guardarMedico(Medico medico) {
        return repositorio.save(medico);
    }

    @Override
    public Medico obtenerMedicoPorID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Medico actualizarMedico(Medico medico) {
        return repositorio.save(medico);
    }

    @Override
    public void eliminarMedico(Long id) {
        repositorio.deleteById(id);
    }
}
