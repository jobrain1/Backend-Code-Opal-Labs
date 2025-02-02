package opal_labs.de.opal_labs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Erlaubt alle Endpoints
                .allowedOrigins("*") // Erlaubt alle Ursprünge
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Erlaubt spezifische Methoden
                .allowedHeaders("*"); // Erlaubt alle Header
    }
}


