package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.User;
import com.example.entity.UserRepository;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void setData() {
        repository.save(new User("Jon", "Snow", "Ned Stark's bastard son"));
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User getData() {
        return new User("Jon", "Snow", "Ned Stark's bastard son");
    }
}
