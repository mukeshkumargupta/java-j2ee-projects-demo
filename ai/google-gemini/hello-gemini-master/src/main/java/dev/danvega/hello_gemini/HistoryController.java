package dev.danvega.hello_gemini;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoryController {

    private final ChatClient chatClient;

    public HistoryController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/presidents")
    public List<President> listPresidents() {
        return chatClient.prompt()
                .user("List all of the presidents in history and return their name with their term in the years they held office.")
                .call()
                .entity(new ParameterizedTypeReference<List<President>>() {});
    }

}
