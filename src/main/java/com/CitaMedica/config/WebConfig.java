package com.CitaMedica.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    //permitir todas las solicitudes desde cualquier origen
    //con todos los métodos HTTP permitidos y
    //todos los encabezados permitidos ya que en este caso se encuentran vacios
    //.allowedOrigins("").allowedMethods("").allowedHeaders("")
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*").allowedOrigins("").allowedMethods("").allowedHeaders("");
    }
}