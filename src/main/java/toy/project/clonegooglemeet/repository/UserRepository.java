package toy.project.clonegooglemeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import toy.project.clonegooglemeet.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
}
