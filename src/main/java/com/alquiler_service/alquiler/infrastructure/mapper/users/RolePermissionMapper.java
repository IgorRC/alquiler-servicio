package com.alquiler_service.alquiler.infrastructure.mapper.users;

import com.alquiler_service.alquiler.domain.users.RolePermission;
import com.alquiler_service.alquiler.infrastructure.persistence.role.RolePermissionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {PermissionMapper.class})
public interface RolePermissionMapper {
    RolePermission toDomain(RolePermissionEntity entity);
    RolePermissionEntity toEntity(RolePermission domain);
}
