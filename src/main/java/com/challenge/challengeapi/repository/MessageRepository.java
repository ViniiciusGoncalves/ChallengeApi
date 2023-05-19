package com.challenge.challengeapi.repository;

import com.challenge.challengeapi.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByUserId(String userId);
}
