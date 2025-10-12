package com.alquiler_service.alquiler.api.dto.role;

import com.alquiler_service.alquiler.domain.users.Role;

import java.util.UUID;

public record RoleSummaryResponse(
        UUID id,
        String name
) {
    public static RoleSummaryResponse from(Role role) {
        return new RoleSummaryResponse(role.getId(), role.getName());
    }
}