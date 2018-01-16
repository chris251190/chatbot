package chatbot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChatBotController {

    @RequestMapping("/")
    public String index() {
        return "I love choco salo!";
    }

}
