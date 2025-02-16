package com.example.ForestConservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Forest")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public ResponseEntity<User> createUser(@RequestBody Map<String, String> payload) {
        // Extract user information from the payload and create a new user
        User user = userService.createUser(
                payload.get("name"),
                payload.get("age"),
                payload.get("gender"),
                payload.get("phone"),
                payload.get("email"),
                payload.get("state"),
                payload.get("district"),
                payload.get("password")
        );
        return ResponseEntity.ok(user); // Return success response with created user object
    }

    @PostMapping("/user/login")
    public ResponseEntity<User> loginUser(@RequestBody Map<String, String> loginRequest) {
        // Extract email and password from login request payload
        String email = loginRequest.get("email");
        String password = loginRequest.get("password");

        // Call userService to authenticate user
        User user = userService.loginUser(email, password);

        // Check if user authentication was successful
        if (user != null) {
            return ResponseEntity.ok(user); // Return user object if login successful
        } else {
            return ResponseEntity.status(401).build(); // Return 401 Unauthorized if login failed
        }
    }
}
