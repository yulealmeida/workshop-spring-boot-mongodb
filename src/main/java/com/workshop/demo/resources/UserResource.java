package com.workshop.demo.resources;


import com.workshop.demo.domain.User;
import com.workshop.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService serv;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = serv.findAll();
        return ResponseEntity.ok().body(list);
    }
}
