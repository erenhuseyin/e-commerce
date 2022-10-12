package com.trendyol.auth.repository;

import com.trendyol.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByUserId(int userId);
    public User findUserByEmail(String email);

}
