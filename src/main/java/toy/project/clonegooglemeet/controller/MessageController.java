package toy.project.clonegooglemeet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;
import toy.project.clonegooglemeet.domain.Message;

@RestController
@RequiredArgsConstructor
public class MessageController {

    // WebSocket 에서 메시지를 전달할 수 있도록 해주는 패키지
    private final SimpMessagingTemplate simpMessagingTemplate;

    // 클라이언트에서 보내는 메시지를 매핑해주는 것으로 앞서 /app + /send => /app/send 로 매핑해줌
    @MessageMapping("/send")
    public void sendMessage(Message message) {
        // /topic/ + 방 이름으로 된 경우에 해당 토픽을 설정하고 여기로 메시지를 전송함
        simpMessagingTemplate.convertAndSend("/topic/"+message.getRoomId(), message);
    }

}
