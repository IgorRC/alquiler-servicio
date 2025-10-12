package com.alquiler_service.alquiler.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI alquilerOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Alquiler API")
                        .description("Documentación de la API para el sistema de alquiler de terrenos.")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("Igor Ramos Cruzado")
                                .email("igor.ramos.cruzado@gmail.com")
                        )
                );
    }
}
