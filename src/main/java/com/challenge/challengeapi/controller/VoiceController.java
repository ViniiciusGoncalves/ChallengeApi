package com.challenge.challengeapi.controller;

import com.challenge.challengeapi.entity.ToggleVoiceRequest;
import com.challenge.challengeapi.service.VoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hearmeout/voice")
public class VoiceController {
    private final VoiceService voiceService;

    @Autowired
    public VoiceController(VoiceService voiceService) {
        this.voiceService = voiceService;
    }

    @PutMapping("/toggle")
    public ResponseEntity<String> toggleVoice(@RequestBody ToggleVoiceRequest request) {
        try {
            voiceService.toggleVoice(request.getUserId(), request.isEnabled());
            return ResponseEntity.ok("Funcionalidade de voz ativada/desativada com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao alternar a funcionalidade de voz.");
        }
    }

}
