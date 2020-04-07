package com.huseyink.spring.repository;

import com.huseyink.spring.dto.UserDto;
import com.huseyink.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {



}
