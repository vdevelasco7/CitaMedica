package com.CitaMedica.Servicio;

import com.CitaMedica.Entidad.Citas.Cita;

import java.util.List;

public interface CitaServicio {
    public List<Cita> listaTodosCitas();

    public Cita guardarCita(Cita cita);

    public Cita obtenerCitaPorID(Long id);

    public Cita actualizarCita(Cita cita);

    public void eliminarCita(Long id);
}
