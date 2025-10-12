package com.alquiler_service.alquiler.infrastructure.persistence.role;


import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class RolePermissionId implements Serializable {
    private UUID roleId;
    private UUID permissionId;
}
