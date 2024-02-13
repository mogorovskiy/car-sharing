package com.mogorovskiy.carsharingspringjpa.mapper;

import com.mogorovskiy.carsharingspringjpa.dto.*;
import com.mogorovskiy.carsharingspringjpa.model.*;
import org.springframework.stereotype.*;

@Service
public class UserMapper {
    public User toModel(UserRequestDto userRequestDto) {
        User user = new User();
        user.setEmail(userRequestDto.getEmail());
        user.setName(userRequestDto.getName());
        user.setPhone(userRequestDto.getPhone());
        user.setCreatedAt(userRequestDto.getCreatedAt());
        return user;
    }
}
