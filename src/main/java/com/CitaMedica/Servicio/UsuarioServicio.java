package com.CitaMedica.Servicio;

import com.CitaMedica.Entidad.Usuarios.Usuario;

import java.util.List;

public interface UsuarioServicio {
    public List<Usuario> listaTodosUsuarios();

    public Usuario guardarUsuario(Usuario usuario);

    public Usuario obtenerUsuarioPorID(Long id);

    public Usuario actualizarUsuario(Usuario usuario);

    public void eliminarUsuario(Long id);
}
