package com.CitaMedica.Controlador;

import com.CitaMedica.Entidad.Citas.Cita;
import com.CitaMedica.Servicio.CitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaControlador {

    @Autowired
    private CitaServicio servicio;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping
    public List<Cita> listaCita() {
        return servicio.listaTodosCitas();
    }

    @PostMapping
    public Cita guardarCita(@RequestBody Cita cita){
        return servicio.guardarCita(cita);
    }

    @PutMapping("/{id}")
    public Cita actualizarCita(@PathVariable Long id, @RequestBody Cita cita){
        Cita citaExistente = servicio.obtenerCitaPorID(id);
        citaExistente.setId(id);
        citaExistente.setFechaHora(cita.getFechaHora());
        citaExistente.setMotivoCita(cita.getMotivoCita());
        citaExistente.setAttribute11(cita.getAttribute11());

        return servicio.actualizarCita(citaExistente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCita(@PathVariable Long id){
        servicio.eliminarCita(id);
    }
}
