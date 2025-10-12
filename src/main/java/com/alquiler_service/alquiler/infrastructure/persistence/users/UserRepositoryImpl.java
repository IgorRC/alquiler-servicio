package com.alquiler_service.alquiler.infrastructure.persistence.users;

import com.alquiler_service.alquiler.domain.users.User;
import com.alquiler_service.alquiler.domain.users.UserRepository;
import com.alquiler_service.alquiler.infrastructure.mapper.users.UserMapper;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository,UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userJpaRepository.findByEmail(email).map(userMapper::toDomain);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return userJpaRepository.findById(id).map(userMapper::toDomain);
    }

    @Override
    public User save(User user) {
        System.out.println(user);
        return userMapper.toDomain(userJpaRepository.save(userMapper.toEntity(user)));
    }
}
