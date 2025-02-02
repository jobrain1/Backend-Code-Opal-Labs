package opal_labs.de.opal_labs.repository;

import opal_labs.de.opal_labs.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmailOrUsername(String email, String username);
}

