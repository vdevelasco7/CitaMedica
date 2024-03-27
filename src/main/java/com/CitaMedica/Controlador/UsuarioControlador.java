package com.CitaMedica.Controlador;

import com.CitaMedica.Entidad.Usuarios.Usuario;
import com.CitaMedica.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    @GetMapping("/")
    public List<Usuario> listaUsuarios() {
        return servicio.listaTodosUsuarios();
    }

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return servicio.guardarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario usuarioExistente = servicio.obtenerUsuarioPorID(id);
        usuarioExistente.setId(id);
        usuarioExistente.setNombre(usuario.getNombre());
        usuarioExistente.setApellidos(usuario.getApellidos());
        usuarioExistente.setUsuario(usuario.getUsuario());
        usuarioExistente.setClave(usuario.getClave());

        return servicio.actualizarUsuario(usuarioExistente);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        servicio.eliminarUsuario(id);
    }
}
