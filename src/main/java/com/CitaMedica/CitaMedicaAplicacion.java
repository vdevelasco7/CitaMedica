package com.CitaMedica;

import com.CitaMedica.Repositorio.MedicoRepositorio;
import com.CitaMedica.Repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitaMedicaAplicacion implements CommandLineRunner {

    public static void main(String[] args){
        SpringApplication.run(CitaMedicaAplicacion.class, args);
    }
    @Autowired
    private UsuarioRepositorio usuarioRepo;
    private MedicoRepositorio medicoRepo;

    public void run(String... args) throws Exception {
/*
        Usuario usuario1 = new Usuario("Antonio", "Velasco", "av", "av");
        repositorio.save(usuario1);

        Medico medico1 = new Medico("Pepe", "Lopez", "pl", "pl", "1234");
        repositorio.save(medico1);

        Usuario usuario2 = new Usuario("Juan", "Garcia", "jg", "jg");
        repositorio.save(usuario2);
*/
    }
}
