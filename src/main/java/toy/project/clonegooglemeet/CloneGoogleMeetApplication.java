package toy.project.clonegooglemeet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CloneGoogleMeetApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloneGoogleMeetApplication.class, args);
	}

}
