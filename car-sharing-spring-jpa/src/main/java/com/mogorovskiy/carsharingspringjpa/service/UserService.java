package com.mogorovskiy.carsharingspringjpa.service;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;

import java.util.List;

public interface UserService {
    User createUser(UserRequestDto userRequestDto);

    List<User> getAllUsers();

    User getUserById(Long userId);

    User updateUser(Long userId, User userDetails);

    void deleteUser(Long userId);
}
