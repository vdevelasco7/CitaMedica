package com.CitaMedica.Servicio;

import com.CitaMedica.Entidad.Diagnosticos.Diagnostico;

import java.util.List;

public interface DiagnosticoServicio {
    public List<Diagnostico> listaTodosDiagnosticos();

    public Diagnostico guardarDiagnostico(Diagnostico diagnostico);

    public Diagnostico obtenerDiagnosticoPorID(Long id);

    public Diagnostico actualizarDiagnostico(Diagnostico diagnostico);

    public void eliminarDiagnostico(Long id);
}
