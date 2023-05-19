package com.challenge.challengeapi.service;
import com.challenge.challengeapi.entity.User;
import com.challenge.challengeapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoiceService {
    private final UserRepository userRepository;

    @Autowired
    public VoiceService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void toggleVoice(String userId, boolean enabled) {
        User user = userRepository.findByUserId(userId);
        if (user != null) {
            user.setVoiceEnabled(enabled);
            userRepository.save(user);
        } else {

        }
    }
}