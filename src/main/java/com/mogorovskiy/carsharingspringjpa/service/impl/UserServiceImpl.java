package com.mogorovskiy.carsharingspringjpa.service.impl;

import com.mogorovskiy.carsharingspringjpa.dto.UserRequestDto;
import com.mogorovskiy.carsharingspringjpa.mapper.UserMapper;
import com.mogorovskiy.carsharingspringjpa.model.User;
import com.mogorovskiy.carsharingspringjpa.repository.UserRepository;
import com.mogorovskiy.carsharingspringjpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User createUser(UserRequestDto userRequestDto) {
        User user = userMapper.toModel(userRequestDto);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }

    @Override
    public User updateUser(Long userId, User userDetails) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            user.setPhone(userDetails.getPhone());
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
