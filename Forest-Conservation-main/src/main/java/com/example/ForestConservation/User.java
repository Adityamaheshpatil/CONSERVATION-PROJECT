package com.example.ForestConservation;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private ObjectId id;
    private String name;
    private String age;
    private String gender;
    private String phone;
    private String email;
    private String state;
    private String district;
    private String password;

    public User(String name, String age, String gender, String phone, String email, String state, String district, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.state = state;
        this.district = district;
        this.password = password;
    }
}

