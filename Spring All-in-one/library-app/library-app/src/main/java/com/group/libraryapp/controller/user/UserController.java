package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreatedRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserServiceV1;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserServiceV1 userServiceV1;

    public UserController(UserServiceV1 userServiceV1) {
        this.userServiceV1 = userServiceV1;
    }

    @PostMapping("/user") // POST /user
    public void saveUser(@RequestBody UserCreatedRequest request) {
        userServiceV1.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userServiceV1.getUsers();
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request) {
        userServiceV1.updateUser(request);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name) {
       userServiceV1.deleteUser(name);
    }

    @GetMapping("/user/error-test")
    public void errorTest() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
