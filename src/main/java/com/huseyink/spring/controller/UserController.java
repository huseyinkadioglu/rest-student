package com.huseyink.spring.controller;

import com.huseyink.spring.dto.UserDto;
import com.huseyink.spring.entity.User;
import com.huseyink.spring.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api" )
public class UserController {

    private UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public String welcomeMessage() {
        return "Welcome!";
    }

    @GetMapping( "/list" )
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userServiceImpl.findAll();
        return ResponseEntity.ok(users);

    }

    @GetMapping( "/{id}" )
    public ResponseEntity<UserDto> getById(@PathVariable( "id" ) Long id) {
        UserDto userDto = userServiceImpl.getById(id);
        return ResponseEntity.ok(userDto);
    }


    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userServiceImpl.save(userDto));
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> deleteUser(@PathVariable( "id" ) Long id) {
        return ResponseEntity.ok(userServiceImpl.deleteById(id));
    }

    @PutMapping( "/ {id}" )
    public ResponseEntity<UserDto> updateUser(@PathVariable( "id" ) Long id, @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userServiceImpl.update(id, userDto));
    }

}
