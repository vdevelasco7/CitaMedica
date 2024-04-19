package com.CitaMedica.Controlador;

import com.CitaMedica.DTO.MedicoDTO;
import com.CitaMedica.Servicio.MedicoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/medicos")
public class MedicoControlador {

    @Autowired
    private MedicoServicio servicio;

    @GetMapping
    public List<MedicoDTO> listaMedicos() {
        return servicio.listaTodosMedicos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MedicoDTO> obtenerMedicoPorID(@PathVariable Long id) {
        MedicoDTO medicoDTO = servicio.obtenerMedicoPorID(id);
        if (medicoDTO != null) {
            return new ResponseEntity<>(medicoDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public MedicoDTO guardarMedico(@Validated @RequestBody MedicoDTO medicoDTO){
        return servicio.guardarMedico(medicoDTO);
    }

    @PutMapping("/{id}")
    public MedicoDTO actualizarMedico(@PathVariable Long id, @Validated @RequestBody MedicoDTO medicoDTO){
        return servicio.actualizarMedico(id, medicoDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarMedico(@PathVariable Long id){
        servicio.eliminarMedico(id);
    }
}
