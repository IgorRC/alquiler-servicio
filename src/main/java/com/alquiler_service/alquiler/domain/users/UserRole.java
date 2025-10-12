package com.alquiler_service.alquiler.domain.users;

import java.time.OffsetDateTime;
import java.util.UUID;

public class UserRole {
    private UUID userId;
    private UUID roleId;
    private OffsetDateTime assignedAt;
    private String assignedBy;
    private boolean active;

    public UserRole(UUID userId, UUID roleId, String assignedBy) {
        this.userId = userId;
        this.roleId = roleId;
        this.assignedBy = assignedBy;
        this.assignedAt = OffsetDateTime.now();
        this.active = true;
    }
}
