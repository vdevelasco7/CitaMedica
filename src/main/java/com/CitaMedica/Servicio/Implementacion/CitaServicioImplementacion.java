package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.Entidad.Citas.Cita;
import com.CitaMedica.Repositorio.CitaRepositorio;
import com.CitaMedica.Servicio.CitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServicioImplementacion implements CitaServicio {

    @Autowired
    private CitaRepositorio repositorio;

    @Override
    public List<Cita> listaTodosCitas() {
        return repositorio.findAll();
    }

    @Override
    public Cita guardarCita(Cita cita) {
        return repositorio.save(cita);
    }

    @Override
    public Cita obtenerCitaPorID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Cita actualizarCita(Cita cita) {
        return repositorio.save(cita);
    }

    @Override
    public void eliminarCita(Long id) {
        repositorio.deleteById(id);
    }
}
