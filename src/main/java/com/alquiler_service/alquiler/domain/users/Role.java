package com.alquiler_service.alquiler.domain.users;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Role {

    private UUID id;
    private String name;
    private String description;
    private Set<Permission> permissions = new HashSet<>();

    public Role() {
    }

    public Role(UUID id, String name, String description, Set<Permission> permissions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.permissions = (permissions != null) ? permissions : new HashSet<>();
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public Set<Permission> getPermissions() {
        return permissions;
    }


    public String getAuthority() {
        return "ROLE_" + this.name.toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
