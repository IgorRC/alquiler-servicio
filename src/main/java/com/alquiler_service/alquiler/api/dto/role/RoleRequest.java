package com.alquiler_service.alquiler.api.dto.role;
import java.util.List;

public record RoleRequest (
        String name,
        String description,
        List<String> permissions
){}
