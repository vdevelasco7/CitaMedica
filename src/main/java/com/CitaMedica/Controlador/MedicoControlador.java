package com.CitaMedica.Controlador;

import com.CitaMedica.Entidad.Usuarios.Medico;
import com.CitaMedica.Servicio.MedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoControlador {

    @Autowired
    private MedicoServicio servicio;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping
    public List<Medico> listaMedico() {
        return servicio.listaTodosMedicos();
    }

    @PostMapping
    public Medico guardarMedico(@RequestBody Medico medico){
        return servicio.guardarMedico(medico);
    }

    @PutMapping("/{id}")
    public Medico actualizarMedico(@PathVariable Long id, @RequestBody Medico medico){
        Medico medicoExistente = servicio.obtenerMedicoPorID(id);
        medicoExistente.setId(id);
        medicoExistente.setNombre(medico.getNombre());
        medicoExistente.setApellidos(medico.getApellidos());
        medicoExistente.setUsuario(medico.getUsuario());
        medicoExistente.setClave(medico.getClave());

        return servicio.actualizarMedico(medicoExistente);
    }

    @DeleteMapping("/{id}")
    public void eliminarMedico(@PathVariable Long id){
        servicio.eliminarMedico(id);
    }
}
