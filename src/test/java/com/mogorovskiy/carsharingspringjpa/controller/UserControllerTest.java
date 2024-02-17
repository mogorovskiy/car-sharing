package com.mogorovskiy.carsharingspringjpa.controller;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import com.mogorovskiy.carsharingspringjpa.service.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @Test
    void testCreateUser() {
        UserRequestDto userRequestDto = new UserRequestDto();
        userRequestDto.setName("testUser");
        User user = new User();
        user.setId(1L);
        user.setName("testUser");
        when(userService.createUser(userRequestDto)).thenReturn(user);
        User result = userController.create(userRequestDto);
        assertEquals(user, result);
    }

    @Test
    void testGetAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        when(userService.getAllUsers()).thenReturn(users);
        List<User> result = userController.getAll();
        assertEquals(2, result.size());
    }

    @Test
    void testGetUserById() {
        Long userId = 1L;
        User user = new User();
        user.setId(userId);
        when(userService.getUserById(userId)).thenReturn(user);
        User result = userController.getById(user);
        assertEquals(userId, result.getId());
    }

    @Test
    void testUpdateUser() {
        Long userId = 1L;
        User userDetails = new User();
        userDetails.setName("newUsername");
        User updatedUser = new User();
        updatedUser.setId(userId);
        updatedUser.setName("newUsername");
        when(userService.updateUser(userId, userDetails)).thenReturn(updatedUser);
        User result = userController.update(userId, userDetails);
        assertEquals(updatedUser, result);
    }

    @Test
    void testDeleteUser() {
        Long userId = 1L;
        userController.delete(userId);
        verify(userService, times(1)).deleteUser(userId);
    }
}