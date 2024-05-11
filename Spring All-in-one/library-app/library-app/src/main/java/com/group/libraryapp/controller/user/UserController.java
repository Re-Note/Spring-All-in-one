package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreatedRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.fruit.FruitService;
import com.group.libraryapp.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    private final FruitService fruitService;

    public UserController(UserService userService, @Qualifier("main") FruitService fruitService) {
        this.userService = userService;
        this.fruitService = fruitService;
    }

    @PostMapping("/user") // POST /user
    public void saveUser(@RequestBody UserCreatedRequest request) {
        userService.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userService.getUsers();
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody UserUpdateRequest request) {
        userService.updateUser(request);
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestParam String name) {
       userService.deleteUser(name);
    }

    @GetMapping("/user/error-test")
    public void errorTest() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
