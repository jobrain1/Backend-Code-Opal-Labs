package opal_labs.de.opal_labs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // CSRF explizit deaktivieren
                .cors(cors -> {
                }) // CORS aktivieren
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/users/register").permitAll()
                        .anyRequest().authenticated()
                );

        return http.build();
    }
}
