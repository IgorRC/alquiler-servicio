package com.alquiler_service.alquiler.api.dto.users;

public record  LoginRequest (
        String email, String password
) {}
