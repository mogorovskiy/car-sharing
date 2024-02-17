package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.UserRequestDto;
import com.mogorovskiy.carsharingspringjpa.model.User;
import java.util.List;

public interface UserService {
    User createUser(UserRequestDto userRequestDto);

    List<User> getAllUsers();

    User getUserById(Long userId);

    User updateUser(Long userId, User userDetails);

    void deleteUser(Long userId);
}
