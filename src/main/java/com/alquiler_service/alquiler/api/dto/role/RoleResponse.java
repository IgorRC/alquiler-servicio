package com.alquiler_service.alquiler.api.dto.role;

import com.alquiler_service.alquiler.domain.users.Role;
import java.util.List;
import java.util.UUID;

public record RoleResponse(
        UUID id,
        String name,
        String description,
        List<PermissionResponse> permissions
) {
    public static RoleResponse from(Role role) {
        List<PermissionResponse> perms = (role.getPermissions() == null)
                ? List.of()
                : role.getPermissions().stream().map(PermissionResponse::from).toList();

        return new RoleResponse(
                role.getId(),
                role.getName(),
                role.getDescription(),
                perms
        );
    }
}