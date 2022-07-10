package toy.project.clonegooglemeet.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Message {

    private String roomId;
    private String message;
    private String author;
    private String to;
    private LocalDateTime localDateTime;

}
