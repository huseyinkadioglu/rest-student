package com.huseyink.spring.service;

import com.huseyink.spring.dto.UserDto;
import com.huseyink.spring.entity.User;

import java.util.List;

public interface UserService {

    UserDto getById(Long id);

    UserDto save(UserDto userDto);

    List<User> findAll();

    Boolean deleteById(Long id);

    UserDto update(Long id, UserDto userDto);


}
