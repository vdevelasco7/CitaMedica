package com.CitaMedica.Controlador;

import com.CitaMedica.Entidad.Usuarios.Usuario;
import com.CitaMedica.Servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//hola
@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio servicio;

    //@GetMapping se utiliza para obtener un mensaje
    @GetMapping("/usuarios")
    public String listaUsuarios(Model modelo) {
        modelo.addAttribute("usuarios", servicio.listaTodosUsuarios());
        return "usuarios";
    }

    /*@GetMapping("/usuarios/nuevo")
    public String crearUsuarioNuevo(Model modelo){
        Usuario usuario = new Usuario();
        modelo.addAttribute("usuario", usuario);
        return "crearUsuario";
        *************Crear HTML para crear este formulario***********
    }
    */
    //@PostMapping se utiliza para enviar datos al servidor
    @PostMapping("usuarios")
    //@ModelAttribute sirve para asignar un objeto usuario al modelo
    public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario){
        servicio.guardarUsuario(usuario);
        //al guardar el usuario se redirecciona en esta ruta
        return "redirect:/usuario";
    }
    /*
    @GetMapping("usuarios/editar/{id}")
    //@PathVariable sirve para configurar variables dentro de la URL
    public String mostrarEditarUsuario(@PathVariable Long id, Model modelo){
        modelo.addAttribute("usuario", servicio.obtenerUsuarioPorID(id));
        return "editarUsuario";
        *************Crear HTML para crear este formulario***********
    }

 */

    @PostMapping("/usuarios/{id}")
    public String actualizarUsuario(@PathVariable Long id, @ModelAttribute("usuario") Usuario usuario, Model modelo){
        Usuario usuarioExistente = servicio.obtenerUsuarioPorID(id);
        usuarioExistente.setId(id);
        usuarioExistente.setNombre(usuario.getNombre());
        usuarioExistente.setApellidos(usuario.getApellidos());
        usuarioExistente.setUsuario(usuario.getUsuario());
        usuarioExistente.setClave(usuario.getClave());

        servicio.actualizarUsuario(usuarioExistente);
        return "redirect:/usuario";
    }

    @GetMapping("/usuarios/{id}")
    public String eliminarUsuario(@PathVariable Long id){
        servicio.eliminarUsuario(id);
        return "redirect:/usuario";
    }
}
