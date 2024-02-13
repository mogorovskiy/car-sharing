package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody UserRequestDto userRequestDto) {
        return userService.createUser(userRequestDto);
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping("/getById")
    public User getById(User user) {
        return userService.getUserById(user.getId());
    }

    @PostMapping("/update")
    public User update(Long userId, User userDetails) {
        return userService.updateUser(userId, userDetails);
    }

    @DeleteMapping("/delete")
    public void delete(Long userId) {
        userService.deleteUser(userId);
    }
}
