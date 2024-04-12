package com.CitaMedica.Servicio;

import com.CitaMedica.DTO.UsuarioDTO;

import java.util.List;

public interface UsuarioServicio {
    List<UsuarioDTO> listaTodosUsuarios();
    UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO);
    UsuarioDTO obtenerUsuarioPorID(Long id);
    UsuarioDTO actualizarUsuario(Long id, UsuarioDTO usuarioDTO);
    void eliminarUsuario(Long id);
}
