package com.trendyol.auth.service;

import com.trendyol.auth.dto.UserDto;
import com.trendyol.auth.entity.User;
import com.trendyol.auth.mapper.UserMapper;
import com.trendyol.auth.repository.UserRepository;
import com.trendyol.auth.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;
    private final UserMapper mapper;


    public UserService(UserRepository repository,
                       UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public UserResponse login(UserDto dto) {
        UserResponse response = new UserResponse();
        User user = repository.findUserByEmail(dto.email);
        if (!user.getPassword().equals(dto.password))
            return null;
        response.user = mapper.toDto(user);
        return response;
    }

    public UserResponse register(UserDto dto) {
        UserResponse response = new UserResponse();
        User user = mapper.toEntity(dto);
        repository.save(user);
        response.user=mapper.toDto(user);
        return response;
    }

    public UserResponse findUser(int userId) {
        UserResponse response = new UserResponse();
        response.user = mapper.toDto(repository.findByUserId(userId));
        return response;
    }
}
