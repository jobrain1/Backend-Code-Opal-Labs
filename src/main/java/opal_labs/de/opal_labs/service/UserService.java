package opal_labs.de.opal_labs.service;

import opal_labs.de.opal_labs.repository.UserRepository;
import opal_labs.de.opal_labs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public int generateTeacherId() {
        return (int) (1000 + Math.random() * 9000);
    }

    public String registerUser(String username, String email, String password) throws Exception {
        Optional<User> existingUser = userRepository.findByEmailOrUsername(email, username);
        if (existingUser.isPresent()) {
            throw new Exception("Benutzer existiert bereits");
        }

        String hashedPassword = bCryptPasswordEncoder.encode(password);
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(hashedPassword);
        newUser.setTeacher(true);
        newUser.setTeacherId(generateTeacherId());
        newUser.setClasses(List.of()); // Leere Klassen für Lehrer
        newUser.setDate(java.time.LocalDateTime.now().toString());

        userRepository.save(newUser);
        return "Registrierung erfolgreich";
    }
}

