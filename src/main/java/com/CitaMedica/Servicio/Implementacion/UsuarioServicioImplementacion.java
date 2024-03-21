package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.Entidad.Usuarios.Usuario;
import com.CitaMedica.Repositorio.UsuarioRepositorio;
import com.CitaMedica.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImplementacion implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<Usuario> listaTodosUsuarios() {
        return repositorio.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorID(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return repositorio.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        repositorio.deleteById(id);
    }
}
