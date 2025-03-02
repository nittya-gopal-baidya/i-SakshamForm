package com.example.controller;

import com.example.model.User;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular

@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers(); // Endpoint to get all the users 
    }

    @GetMapping("/home") //Endpoint to go Homepage of application
    public String home() {
        return "Welcome to i-Saksham Homepage";
    }

    @PostMapping("/create")
    public User signup(@RequestBody User user) {
        return userService.create(user); // Endpoint to insert userDetails into Database
    }


    @GetMapping("/getUserById/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id); // Endpoint to get userDetails form Database
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser); // Endpoint to update userDetails in Database
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id); // Endpoint to delete userDetails from Database 
    }

    @PostMapping("/login") // Endpoint to login by providing valid user credintials
    public User login(@RequestBody User loginUser) {
        return userService.login(loginUser.getEmail(), loginUser.getPassword());

    }
}
