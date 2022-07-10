package toy.project.clonegooglemeet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;
import toy.project.clonegooglemeet.config.socket.SocketHandler;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // WebSocket 접속을 위한 EndPoint
        registry.addEndpoint("/chat").setAllowedOrigins("*").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // WebSocket 을 연결하는 과정에서 메시지가 들어오는 경로를 설정하는 것으로
        // /app 으로 접근하는 메시지만 핸들러로 라우팅을 함
        // /topic 은 얘를 들어 클라이언트가 구독하고 있는 채팅방 A가 있을 때 /topic/A 을 구독하는 사람들만 소통이 가능함
        // 따라서 /topic 은 주제의 Prefix 라고 보면 될 것이다.
        registry.setApplicationDestinationPrefixes("/app")
            .enableSimpleBroker("/topic");
    }
}
