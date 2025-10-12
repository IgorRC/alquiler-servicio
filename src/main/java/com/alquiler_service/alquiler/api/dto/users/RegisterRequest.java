package com.alquiler_service.alquiler.api.dto.users;

import com.alquiler_service.alquiler.domain.users.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record RegisterRequest (
        @NotBlank(message = "El nombre es obligatorio")
        @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+$",message = "El nombre solo puede contener letras y espacios")
        String name,
        @NotBlank(message = "El correo es obligatorio")
        @Email(message = "Debe ingresar un correo valido")
        String email,
        String password,
        Role role,
        String phone,
        boolean whatsappOptIn
) {}
