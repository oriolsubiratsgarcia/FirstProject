package com.example.easynotes.controller;

import com.example.easynotes.exception.ResourceNotFoundException;
import com.example.easynotes.model.User;
import com.example.easynotes.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController /* Spring li diu que escolte un port http */
@RequestMapping("/") /* url on es mapeja el request */
public class UserController {


    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String sayHi(){
        return "Root directory!";
    }

    @GetMapping("/user") /* GetMapping -> introdueixo la url i m'executa el metode */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User createUsers(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id") Integer userID) {
        return userRepository.findById(Long.valueOf(userID))
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userID));
    }

    // Update a User

    // Delete a User
}