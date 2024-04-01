package com.CitaMedica.Controlador;

import com.CitaMedica.Entidad.Diagnosticos.Diagnostico;
import com.CitaMedica.Servicio.DiagnosticoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnosticos")
public class DiagnosticoControlador {

    @Autowired
    private DiagnosticoServicio servicio;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping
    public List<Diagnostico> listaDiagnostico() {
        return servicio.listaTodosDiagnosticos();
    }

    @PostMapping
    public Diagnostico guardarDiagnostico(@RequestBody Diagnostico diagnostico){
        return servicio.guardarDiagnostico(diagnostico);
    }

    @PutMapping("/{id}")
    public Diagnostico actualizarDiagnostico(@PathVariable Long id, @RequestBody Diagnostico diagnostico){
        Diagnostico diagnosticoExistente = servicio.obtenerDiagnosticoPorID(id);
        diagnosticoExistente.setId(id);
        diagnosticoExistente.setValoracionEspecialista(diagnostico.getValoracionEspecialista());
        diagnosticoExistente.setEnfermedad(diagnostico.getEnfermedad());

        return servicio.actualizarDiagnostico(diagnosticoExistente);
    }

    @DeleteMapping("/{id}")
    public void eliminarDiagnostico(@PathVariable Long id){
        servicio.eliminarDiagnostico(id);
    }
}
