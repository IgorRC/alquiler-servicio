package com.alquiler_service.alquiler.infrastructure.persistence.users;

import com.alquiler_service.alquiler.infrastructure.persistence.role.RoleEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user_roles")
public class UserRoleEntity implements Serializable {
    @EmbeddedId
    private UserRoleId id = new UserRoleId();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("roleId")
    @JoinColumn(name = "role_id", nullable = false)
    private RoleEntity role;

    @Column(nullable = false, updatable = false)
    private OffsetDateTime assignedAt = OffsetDateTime.now();

    @Column(nullable = false)
    private String assignedBy;

    @Column(nullable = false)
    private boolean active = true;
}
