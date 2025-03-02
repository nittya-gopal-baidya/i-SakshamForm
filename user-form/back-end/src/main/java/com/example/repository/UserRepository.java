package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;//This imports JpaRepository, which provides built-in database operations like save, findAll, findById, delete, etc.

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);//This method allows you to fetch a User by their email
}
