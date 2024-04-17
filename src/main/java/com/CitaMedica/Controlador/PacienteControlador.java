package com.CitaMedica.Controlador;

import com.CitaMedica.DTO.PacienteDTO;
import com.CitaMedica.Servicio.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/pacientes")
public class PacienteControlador {

    @Autowired
    private PacienteServicio servicio;

    @GetMapping
    public List<PacienteDTO> listaPacientes() {
        return servicio.listaTodosPacientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> obtenerPacientePorID(@PathVariable Long id) {
        PacienteDTO pacienteDTO = servicio.obtenerPacientePorID(id);
        if (pacienteDTO != null) {
            return new ResponseEntity<>(pacienteDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public PacienteDTO guardarPaciente(@Validated @RequestBody PacienteDTO pacienteDTO){
        return servicio.guardarPaciente(pacienteDTO);
    }

    @PutMapping("/{id}")
    public PacienteDTO actualizarPaciente(@PathVariable Long id, @Validated @RequestBody PacienteDTO pacienteDTO){
        return servicio.actualizarPaciente(id, pacienteDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarPaciente(@PathVariable Long idPac){
        servicio.eliminarPaciente(idPac);
    }
}
