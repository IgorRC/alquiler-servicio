package com.alquiler_service.alquiler.api.users;
import com.alquiler_service.alquiler.api.dto.role.PermissionResponse;
import com.alquiler_service.alquiler.application.users.PermissionService;
import com.alquiler_service.alquiler.domain.shared.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/permissions")
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<PermissionResponse>>> getAll() {
        List<PermissionResponse> result = permissionService.getAll()
                .stream()
                .map(PermissionResponse::from)
                .toList();
        return ResponseEntity.ok(new ApiResponse<>(result));
    }
}
