package com.alquiler_service.alquiler.infrastructure.mapper.users;

import com.alquiler_service.alquiler.domain.users.User;
import com.alquiler_service.alquiler.infrastructure.persistence.users.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toDomain(UserEntity e);
    UserEntity toEntity(User d);
}
