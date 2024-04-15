package com.CitaMedica.Servicio.Implementacion;

import com.CitaMedica.DTO.UsuarioDTO;
import com.CitaMedica.Entidad.Usuarios.Usuario;
import com.CitaMedica.Repositorio.UsuarioRepositorio;
import com.CitaMedica.Servicio.UsuarioServicio;
import com.CitaMedica.exception.ResourceNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServicioImplementacion implements UsuarioServicio {

    @Autowired
    private UsuarioRepositorio repositorio;

    @Override
    public List<UsuarioDTO> listaTodosUsuarios() {
        List<Usuario> usuarios = repositorio.findAll();
        return usuarios.stream().map(this::convertirAUsuarioDTO).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO guardarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = convertirAUsuario(usuarioDTO);
        Usuario usuarioGuardado = repositorio.save(usuario);
        return convertirAUsuarioDTO(usuarioGuardado);
    }

    @Override
    public UsuarioDTO obtenerUsuarioPorID(Long id) {
        Usuario usuario = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        return convertirAUsuarioDTO(usuario);
    }

    @Override
    public UsuarioDTO actualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuarioExistente = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        if (usuarioExistente != null) {
            BeanUtils.copyProperties(usuarioDTO, usuarioExistente, "id");
            Usuario usuarioActualizado = repositorio.save(usuarioExistente);
            return convertirAUsuarioDTO(usuarioActualizado);
        }
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {
        Usuario usuario = repositorio.findById(id).orElseThrow(ResourceNotFoundException::new);
        repositorio.delete(usuario);
    }

    private UsuarioDTO convertirAUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        if (usuario != null) {
            BeanUtils.copyProperties(usuario, usuarioDTO);
        }
        return usuarioDTO;
    }

    private Usuario convertirAUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDTO, usuario);
        return usuario;
    }
}