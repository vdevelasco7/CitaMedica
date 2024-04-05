package com.CitaMedica;

import com.CitaMedica.Repositorio.UsuarioRepositorio;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class CitaMedicaAplicacion /*implements CommandLineRunner*/ {

    public static void main(String[] args){
        SpringApplication.run(CitaMedicaAplicacion.class, args);
    }
    @Autowired
    private UsuarioRepositorio repositorio;

    @Bean
    public OpenAPI modificarOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Cita Médica")
                        .version("0.11")
                        .description("App Cita Médica con Swagger"));
    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
                "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
        corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
        corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
/*
    public void run(String... args) throws Exception {

        Usuario usuario1 = new Usuario("Antonio", "Velasco", "av", "av");
        repositorio.save(usuario1);

        Medico medico1 = new Medico("Pepe", "Lopez", "pl", "pl", "1234");
        repositorio.save(medico1);

        Usuario usuario2 = new Usuario("Juan", "Garcia", "jg", "jg");
        repositorio.save(usuario2);
        }
*/

}
