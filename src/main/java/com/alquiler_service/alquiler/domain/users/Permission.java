package com.alquiler_service.alquiler.domain.users;

import java.util.UUID;

public class Permission {
    private UUID id;
    private String name;
    private String description;

    public Permission() {
    }

    public Permission(String name){
        this.name = name;
    }

    public Permission(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
