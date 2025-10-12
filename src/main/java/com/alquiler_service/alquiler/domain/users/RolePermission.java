package com.alquiler_service.alquiler.domain.users;

import java.time.OffsetDateTime;
import java.util.UUID;

public class RolePermission {

    private UUID roleId;
    private UUID permissionId;
    private OffsetDateTime grantedAt;
    private String grantedBy;
    private boolean active;

    public RolePermission(UUID roleId, UUID permissionId, String grantedBy) {
        this.roleId = roleId;
        this.permissionId = permissionId;
        this.grantedBy = grantedBy;
        this.grantedAt = OffsetDateTime.now();
        this.active = true;
    }

    public UUID getRoleId() {
        return roleId;
    }

    public void setRoleId(UUID roleId) {
        this.roleId = roleId;
    }

    public UUID getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(UUID permissionId) {
        this.permissionId = permissionId;
    }

    public OffsetDateTime getGrantedAt() {
        return grantedAt;
    }

    public void setGrantedAt(OffsetDateTime grantedAt) {
        this.grantedAt = grantedAt;
    }

    public String getGrantedBy() {
        return grantedBy;
    }

    public void setGrantedBy(String grantedBy) {
        this.grantedBy = grantedBy;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
