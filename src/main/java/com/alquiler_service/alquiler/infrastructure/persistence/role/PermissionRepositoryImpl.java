package com.alquiler_service.alquiler.infrastructure.persistence.role;

import com.alquiler_service.alquiler.domain.users.Permission;
import com.alquiler_service.alquiler.domain.users.PermissionRepository;
import com.alquiler_service.alquiler.infrastructure.mapper.users.PermissionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PermissionRepositoryImpl implements PermissionRepository{

    private final PermissionJpaRepository jpaRepository;
    private final PermissionMapper mapper;

    @Override
    public List<Permission> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(mapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Permission> findByName(String name) {
        return jpaRepository.findByName(name).map(mapper::toDomain);
    }

    @Override
    public Permission save(Permission permission) {
        PermissionEntity entity = mapper.toEntity(permission);
        return mapper.toDomain(jpaRepository.save(entity));
    }
}
