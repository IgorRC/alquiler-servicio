package com.alquiler_service.alquiler.application.users;

import com.alquiler_service.alquiler.domain.shared.BusinessException;
import com.alquiler_service.alquiler.domain.users.Permission;
import com.alquiler_service.alquiler.domain.users.PermissionRepository;
import com.alquiler_service.alquiler.domain.users.Role;
import com.alquiler_service.alquiler.domain.users.RoleRepository;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;


@Service
public class RoleService {

    private final RoleRepository roleRepository;
    private final PermissionRepository permissionRepository;

    public RoleService(RoleRepository roleRepository, PermissionRepository permissionRepository) {
        this.roleRepository = roleRepository;
        this.permissionRepository = permissionRepository;
    }

    public Role create(Role role) {
        Set<Permission> permissions = new HashSet<>();

        if(role.getPermissions() != null && !role.getPermissions().isEmpty()) {
            for(Permission permission : role.getPermissions()) {
                Permission perm = permissionRepository.findByName(permission.getName())
                        .orElseThrow(() -> new BusinessException("Persmiso no encontrado " + permission.getName()));
                permissions.add(perm);
            }
        }
        Role newRole = new Role(
                null,
                role.getName(),
                role.getDescription(),
                permissions
        );
        System.out.println("New role in app service : " + newRole.getName());
        return roleRepository.save(newRole);
    }

    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    public Role getById(UUID id) {
        return roleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
    }

    public Role update(UUID id, Role role) {
        Role existing = getById(id);
        return roleRepository.save(
                new Role(id, role.getName(), role.getDescription(), role.getPermissions())
        );
    }

    public void delete(UUID id) {
        roleRepository.delete(id);
    }
}
