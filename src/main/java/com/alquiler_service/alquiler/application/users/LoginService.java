package com.alquiler_service.alquiler.application.users;

import com.alquiler_service.alquiler.domain.shared.BusinessException;
import com.alquiler_service.alquiler.domain.shared.PasswordEncoderPort;
import com.alquiler_service.alquiler.domain.users.User;
import com.alquiler_service.alquiler.domain.users.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final UserRepository userRepository;
    private final PasswordEncoderPort passwordEncoder;

    public record Command(String email, String password) {}

    public LoginService(UserRepository userRepository, PasswordEncoderPort passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User handle(Command cmd) {
        User user = userRepository.findByEmail(cmd.email().toLowerCase())
                .orElseThrow(() -> new BusinessException("Credenciales inválidas"));
        if (!user.isActivo() || !passwordEncoder.matches(cmd.password(), user.getPasswordHash())) {
            throw new BusinessException("Credenciales inválidas");
        }
        return user;
    }

}
