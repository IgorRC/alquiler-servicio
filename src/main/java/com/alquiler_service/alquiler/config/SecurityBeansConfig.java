package com.alquiler_service.alquiler.config;

import com.alquiler_service.alquiler.domain.shared.PasswordEncoderPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityBeansConfig {

    @Bean
    public PasswordEncoderPort passwordEncoderPort() {
        var enc = new BCryptPasswordEncoder();
        return new PasswordEncoderPort() {
            @Override
            public String encode(String raw) {
                return enc.encode(raw);
            }

            @Override
            public boolean matches(String raw, String hash) {
                return enc.matches(raw, hash);
            }
        };
    }

}
