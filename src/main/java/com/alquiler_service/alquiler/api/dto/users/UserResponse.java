package com.alquiler_service.alquiler.api.dto.users;

import com.alquiler_service.alquiler.domain.users.User;

public record UserResponse(
        String id,
        String name,
        String email,
        String role
) {
    public static UserResponse from(User u){
        return new UserResponse(
                u.getId().toString(),
                u.getName(),
                u.getEmail(),
                u.getRole().getName()
        );
    }
}
