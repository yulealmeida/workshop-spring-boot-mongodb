package com.workshop.demo.services;

import com.workshop.demo.domain.User;
import com.workshop.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository rep;

    public List<User> findAll(){
        return rep.findAll();
    }
}
