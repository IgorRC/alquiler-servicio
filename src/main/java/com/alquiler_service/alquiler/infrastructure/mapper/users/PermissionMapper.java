package com.alquiler_service.alquiler.infrastructure.mapper.users;

import com.alquiler_service.alquiler.domain.users.Permission;
import com.alquiler_service.alquiler.infrastructure.persistence.role.PermissionEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toDomain(PermissionEntity entity);
    PermissionEntity toEntity(Permission domain);
}