package com.workshop.demo.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private String id;
    private String name;
    private String email;

    public User () {
    }

    public User (String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId () {
        return id;
    }

    public User setId (String id) {
        this.id = id;
        return this;
    }

    public String getName () {
        return name;
    }

    public User setName (String name) {
        this.name = name;
        return this;
    }

    public String getEmail () {
        return email;
    }

    public User setEmail (String email) {
        this.email = email;
        return this;
    }

    @Override
    public boolean equals (Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode () {
        return Objects.hashCode(id);
    }
}
