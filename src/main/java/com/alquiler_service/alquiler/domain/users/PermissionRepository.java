package com.alquiler_service.alquiler.domain.users;

import java.util.List;
import java.util.Optional;

public interface PermissionRepository {
    List<Permission> findAll();
    Optional<Permission> findByName(String name);
    Permission save(Permission permission);
}