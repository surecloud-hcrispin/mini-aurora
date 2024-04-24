package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "main.repositories")
public class MiniAurora {
    public static void main (String[] args) {
        SpringApplication.run(MiniAurora.class, args);
    }
}