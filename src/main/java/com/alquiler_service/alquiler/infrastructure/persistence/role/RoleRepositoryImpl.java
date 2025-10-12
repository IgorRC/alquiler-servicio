package com.alquiler_service.alquiler.infrastructure.persistence.role;

import com.alquiler_service.alquiler.domain.users.Role;
import com.alquiler_service.alquiler.domain.users.RoleRepository;
import com.alquiler_service.alquiler.infrastructure.mapper.users.RoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class RoleRepositoryImpl implements RoleRepository {

    private final RoleJpaRepository roleJpaRepository;
    private final RoleMapper roleMapper;


    /**
     * @param role
     * @return
     */
    @Override
    public Role save(Role role) {
        RoleEntity roleEntity = roleMapper.toEntity(role);
        RoleEntity roleEntitySaved = roleJpaRepository.save(roleEntity);
        return roleMapper.toDomain(roleEntitySaved);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Role> findById(UUID id) {
        return Optional.empty();
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Optional<Role> findByName(String name) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Role> findAll() {
        return roleJpaRepository.findAll()
                .stream()
                .map(roleMapper::toDomain)
                .toList();
    }

    /**
     * @param id
     */
    @Override
    public void delete(UUID id) {

    }
}
