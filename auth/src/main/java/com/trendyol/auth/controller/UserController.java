package com.trendyol.auth.controller;

import com.trendyol.auth.dto.UserDto;
import com.trendyol.auth.response.UserResponse;
import com.trendyol.auth.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody UserDto dto){
        return userService.login(dto);
    }

    @PostMapping("/register")
    public UserResponse register(@RequestBody UserDto dto){
        return userService.register(dto);
    }

    @GetMapping("/findUser/{userId}")
    public UserResponse findUser(@PathVariable(value = "userId")int userId){
        return userService.findUser(userId);
    }
}
