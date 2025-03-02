package com.example.services;

import com.example.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public User create(User user);

    List<User> getAllUsers(); //Method to get all users

    Optional<User> getUserById(Long id); //Method to get user by ID

    User updateUser(Long id, User updatedUser); //Method to update user

    void deleteUser(Long id); //Method to delete user

    // Login Method
    public User login(String email, String password);


}
