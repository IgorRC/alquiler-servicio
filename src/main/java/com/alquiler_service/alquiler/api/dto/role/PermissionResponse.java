package com.alquiler_service.alquiler.api.dto.role;

import com.alquiler_service.alquiler.domain.users.Permission;

import java.util.UUID;

public record PermissionResponse(
        UUID id,
        String name,
        String description
) {
    public static PermissionResponse from(Permission permission) {
        return new PermissionResponse(
                permission.getId(),
                permission.getName(),
                permission.getDescription()
        );
    }
}