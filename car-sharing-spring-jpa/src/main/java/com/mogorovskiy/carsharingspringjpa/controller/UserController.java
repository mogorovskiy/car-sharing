package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody UserRequestDto userRequestDto) {
        log.info("Create user: {}", userRequestDto);
        return userService.createUser(userRequestDto);
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        log.info("Get all users: ");
        return userService.getAllUsers();
    }

    @GetMapping("/getById")
    public User getById(User user) {
        log.info("Get user by id: ");
        return userService.getUserById(user.getId());
    }

    @PostMapping("/update")
    public User update(Long userId, User userDetails) {
        log.info("Update user: ");
        return userService.updateUser(userId, userDetails);
    }

    @DeleteMapping("/delete")
    public void delete(Long userId) {
        log.info("Delete user :(");
        userService.deleteUser(userId);
    }
}
