package com.alquiler_service.alquiler.infrastructure.mapper.users;

import com.alquiler_service.alquiler.domain.users.Permission;
import com.alquiler_service.alquiler.domain.users.Role;
import com.alquiler_service.alquiler.infrastructure.persistence.role.PermissionEntity;
import com.alquiler_service.alquiler.infrastructure.persistence.role.RoleEntity;
import com.alquiler_service.alquiler.infrastructure.persistence.role.RolePermissionEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.HashSet;
import java.util.Set;

@Mapper(componentModel = "spring", uses = {PermissionMapper.class})
public interface RoleMapper {
    RoleEntity toEntity(Role role);
    Role toDomain(RoleEntity entity);

    @AfterMapping
    default void mapPermissions(Role role, @MappingTarget RoleEntity entity, PermissionMapper permissionMapper) {
        if (role.getPermissions() != null) {
            Set<RolePermissionEntity> rolePermissions = new HashSet<>();
            for (Permission p : role.getPermissions()) {
                PermissionEntity permEntity = permissionMapper.toEntity(p);

                RolePermissionEntity rp = new RolePermissionEntity();
                rp.setRole(entity);
                rp.setPermission(permEntity);

                rolePermissions.add(rp);
            }
            entity.setRolePermissions(rolePermissions);
        }
    }
}