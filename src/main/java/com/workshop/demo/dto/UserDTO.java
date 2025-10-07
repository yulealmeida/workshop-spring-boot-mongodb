package com.workshop.demo.dto;

import com.workshop.demo.domain.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;



public class UserDTO implements Serializable {


    private String id;
    private String name;
    private String email;

    public UserDTO () {
    }

    public UserDTO (User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId () {
        return id;
    }

    public UserDTO setId (String id) {
        this.id = id;
        return this;
    }

    public String getName () {
        return name;
    }

    public UserDTO setName (String name) {
        this.name = name;
        return this;
    }

    public String getEmail () {
        return email;
    }

    public UserDTO setEmail (String email) {
        this.email = email;
        return this;
    }
}

