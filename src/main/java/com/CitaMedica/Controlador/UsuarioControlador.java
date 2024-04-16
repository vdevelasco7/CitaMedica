package com.CitaMedica.Controlador;

import com.CitaMedica.DTO.UsuarioDTO;
import com.CitaMedica.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/")
    public String home() {
        return "index"; // aquí "index" es el nombre de tu vista para la página de inicio
    }

    @GetMapping
    public List<UsuarioDTO> listaUsuarios() {
        return servicio.listaTodosUsuarios();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> obtenerUsuarioPorID(@PathVariable Long id) {
        UsuarioDTO usuarioDTO = servicio.obtenerUsuarioPorID(id);
        if (usuarioDTO != null) {
            return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public UsuarioDTO guardarUsuario(@Validated @RequestBody UsuarioDTO usuarioDTO){
        return servicio.guardarUsuario(usuarioDTO);
    }

    @PutMapping("/{id}")
    public UsuarioDTO actualizarUsuario(@PathVariable Long id, @Validated @RequestBody UsuarioDTO usuarioDTO){
        return servicio.actualizarUsuario(id, usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        servicio.eliminarUsuario(id);
    }
}
