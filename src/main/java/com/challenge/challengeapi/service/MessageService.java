package com.challenge.challengeapi.service;
import com.challenge.challengeapi.entity.Message;
import com.challenge.challengeapi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public void sendMessage(String userId, String message) {
        Message newMessage = new Message();
        newMessage.setUserId(userId);
        newMessage.setText(message);
        messageRepository.save(newMessage);
    }

    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    public List<Message> getMessageHistory(String userId) {
        return messageRepository.findByUserId(userId);
    }
}
