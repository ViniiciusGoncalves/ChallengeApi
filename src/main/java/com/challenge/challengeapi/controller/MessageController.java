package com.challenge.challengeapi.controller;

import com.challenge.challengeapi.entity.Message;
import com.challenge.challengeapi.entity.UserIdRequest;
import com.challenge.challengeapi.service.MessageService;
import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hearmeout/messages")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody Message message) {
        try {
            messageService.sendMessage(message.getUserId(), message.getText());

            OpenAiService service = new OpenAiService("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");
            CompletionRequest completionRequest = CompletionRequest.builder()
                    .prompt(message.getText())
                    .model("ada")
                    .build();
            String response;

            try {
                response = service.createCompletion(completionRequest).getChoices().get(0).getText();
            } catch (Exception e) {
                System.err.println("Erro ao chamar a API do GPT: " + e.getMessage());
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao chamar a API do GPT");
            }

            System.out.println("Resposta do GPT: " + response);

            message.setResponse(response);
            messageService.saveMessage(message);

            return ResponseEntity.ok("Mensagem enviada com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro na mensagem");
        }
    }

    @GetMapping("/history")
    public ResponseEntity<List<Message>> getMessageHistory(@RequestBody UserIdRequest request) {
        try {
            List<Message> history = messageService.getMessageHistory(request.getUserId());
            return ResponseEntity.ok(history);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}

