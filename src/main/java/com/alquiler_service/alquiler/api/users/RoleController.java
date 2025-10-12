package com.alquiler_service.alquiler.api.users;

import com.alquiler_service.alquiler.api.dto.role.RoleRequest;
import com.alquiler_service.alquiler.api.dto.role.RoleResponse;
import com.alquiler_service.alquiler.api.dto.role.RoleSummaryResponse;
import com.alquiler_service.alquiler.application.users.RoleService;
import com.alquiler_service.alquiler.domain.shared.ApiResponse;
import com.alquiler_service.alquiler.domain.users.Permission;
import com.alquiler_service.alquiler.domain.users.Role;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<RoleSummaryResponse>>> getAll() {
        List<RoleSummaryResponse> result = roleService.getAll()
                .stream()
                .map(RoleSummaryResponse::from)
                .toList();
        return ResponseEntity.ok(new ApiResponse<>(result));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<RoleResponse>> create(@RequestBody RoleRequest roleRequest) {
        Set<Permission> permissions = new HashSet<>();
        roleRequest.permissions().forEach(p -> permissions.add(new Permission(p)));
        Role role = roleService.create(new Role(
                null,
                roleRequest.name(),
                roleRequest.description(),
                permissions
        ));
        return ResponseEntity.ok(new ApiResponse<>(RoleResponse.from(role)));
    }
}
