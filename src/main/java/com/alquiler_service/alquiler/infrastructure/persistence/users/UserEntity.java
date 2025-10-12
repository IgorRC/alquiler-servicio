package com.alquiler_service.alquiler.infrastructure.persistence.users;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(name="password_hash", nullable=false)
    private String passwordHash;

    private String phone;

    @Column(name="whatsapp_opt_in", nullable=false)
    private boolean whatsappOptIn;

    private boolean activo;

    @Column(name="created_at", nullable=false, updatable = false)
    private OffsetDateTime createdAt;

    @Column(name="updated_at", nullable=false)
    private OffsetDateTime updatedAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserRoleEntity> userRoles = new HashSet<>();


    @PrePersist
    void prePersist() {
        var now = OffsetDateTime.now();
        createdAt = now;
        updatedAt = now;
    }

    @PreUpdate
    void preUpdate() {
        updatedAt = OffsetDateTime.now();
    }
}