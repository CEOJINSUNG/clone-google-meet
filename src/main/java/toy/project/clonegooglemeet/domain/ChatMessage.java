package toy.project.clonegooglemeet.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ChatMessage {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private MessageType type;
    private String sender;
    private String message;


    public enum MessageType {
        ENTER, QUIT, TALK
    }

}
