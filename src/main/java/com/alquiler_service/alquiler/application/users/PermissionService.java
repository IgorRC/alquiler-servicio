package com.alquiler_service.alquiler.application.users;

import com.alquiler_service.alquiler.domain.users.Permission;
import com.alquiler_service.alquiler.domain.users.PermissionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionService {

    private final PermissionRepository permissionRepository;

    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public List<Permission> getAll() {
        return permissionRepository.findAll();
    }

    public Permission create(String name, String description) {
        return permissionRepository.save(new Permission(null, name, description));
    }
}
