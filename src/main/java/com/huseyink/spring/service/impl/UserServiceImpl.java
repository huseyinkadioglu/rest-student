package com.huseyink.spring.service.impl;

import com.huseyink.spring.dto.UserDto;
import com.huseyink.spring.entity.User;
import com.huseyink.spring.repository.UserRepository;
import com.huseyink.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;
    private ModelMapper modelMapper;


    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        ;
    }

    @Override
    public UserDto getById(Long id) {

        User userDb = this.userRepository.getOne(id);
        return modelMapper.map(userDb, UserDto.class);


    }

    @Override
    public UserDto save(@RequestBody UserDto userDto) {

        User userDb = modelMapper.map(userDto, User.class);
        userDb = userRepository.save(userDb);
        return modelMapper.map(userDb, UserDto.class);


    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();

    }

    @Override
    public Boolean deleteById(Long id) {
        userRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @Override
    public UserDto update(Long id, UserDto userDto) {
        User userDb = modelMapper.map(userDto,User.class);
        userDb = userRepository.getOne(id);
        return userDto;
    }


}
