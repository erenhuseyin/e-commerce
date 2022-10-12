package com.trendyol.auth.mapper;

import com.trendyol.auth.dto.UserDto;
import com.trendyol.auth.entity.User;
import org.mapstruct.Mapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.salesforce.atrium")
@Mapper(componentModel = "spring")
public interface UserMapper extends IEntityMapper<UserDto, User> {
}
