package com.CitaMedica.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MedicoDTO extends UsuarioDTO{

    //@NotBlank(message = "El número de colegiado es obligatorio")
    private String numColegiado;

}
