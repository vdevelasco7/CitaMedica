package com.CitaMedica.Controlador;

import com.CitaMedica.Entidad.Usuarios.Paciente;
import com.CitaMedica.Servicio.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    private PacienteServicio servicio;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping
    public List<Paciente> listaPaciente() {
        return servicio.listaTodosPacientes();
    }

    @PostMapping
    public Paciente guardarPaciente(@RequestBody Paciente paciente){
        return servicio.guardarPaciente(paciente);
    }

    @PutMapping("/{id}")
    public Paciente actualizarPaciente(@PathVariable Long id, @RequestBody Paciente paciente){
        Paciente pacienteExistente = servicio.obtenerPacientePorID(id);
        pacienteExistente.setId(id);
        pacienteExistente.setNombre(paciente.getNombre());
        pacienteExistente.setApellidos(paciente.getApellidos());
        pacienteExistente.setUsuario(paciente.getUsuario());
        pacienteExistente.setClave(paciente.getClave());

        return servicio.actualizarPaciente(pacienteExistente);
    }

    @DeleteMapping("/{id}")
    public void eliminarPaciente(@PathVariable Long id){
        servicio.eliminarPaciente(id);
    }
}
