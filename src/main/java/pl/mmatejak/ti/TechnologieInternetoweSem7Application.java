package pl.mmatejak.ti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
@SpringBootApplication
public class TechnologieInternetoweSem7Application {

    public static void main(final String... args) {
        SpringApplication.run(TechnologieInternetoweSem7Application.class, args);
    }
}
