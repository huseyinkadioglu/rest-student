package com.huseyink.spring.repository;

import com.huseyink.spring.entity.Speech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeechRepository extends JpaRepository<Speech,Long> {
}
