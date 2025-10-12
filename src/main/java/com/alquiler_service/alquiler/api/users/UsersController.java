package com.alquiler_service.alquiler.api.users;

import com.alquiler_service.alquiler.api.dto.users.LoginRequest;
import com.alquiler_service.alquiler.api.dto.users.RegisterRequest;
import com.alquiler_service.alquiler.api.dto.users.UserResponse;
import com.alquiler_service.alquiler.application.users.LoginService;
import com.alquiler_service.alquiler.application.users.RegisterUserService;
import com.alquiler_service.alquiler.domain.shared.ApiResponse;
import com.alquiler_service.alquiler.domain.users.User;
import com.alquiler_service.alquiler.domain.users.Role;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

//    private final RegisterUserService registerUserService;
//    private final LoginService loginService;
//
//
//    public UsersController(RegisterUserService registerUserService, LoginService loginService) {
//        this.registerUserService = registerUserService;
//        this.loginService = loginService;
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<ApiResponse<UserResponse>> register(@Valid @RequestBody RegisterRequest req){
////        var cmd = new RegisterUserService.Command(
////                req.name(),
////                req.email(),
////                req.password(),
////                req.role() == null ? "" : req.role(),
////                req.phone(),
////                req.whatsappOptIn()
////        );
////        User user = registerUserService.handle(cmd);
//        return ResponseEntity.ok(new ApiResponse<>(UserResponse.from(new User())));
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<ApiResponse<UserResponse>>  login(@RequestBody LoginRequest req){
//        User user = loginService.handle(new LoginService.Command(req.email(), req.password()));
//        return ResponseEntity.ok(new ApiResponse<>(UserResponse.from(user)));
//    }
}
