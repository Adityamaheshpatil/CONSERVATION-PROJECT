package com.example.ForestConservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User createUser(String name, String age, String gender, String phone, String email, String state, String district, String password) {


        // Create a new user object with encoded password
        User user = new User(name, age, gender, phone, email, state, district, password);

        // Save the user object in the database
        return userRepository.save(user);
    }

    public User loginUser(String email, String password) {
        // Find user by email from the database
        User user = userRepository.findByEmail(email);

        // Check if user exists and password matches
        if (user != null && Objects.equals(password, user.getPassword())) {
            return user; // Return user object if login successful
        }
        return null; // Return null if login failed
    }
}
