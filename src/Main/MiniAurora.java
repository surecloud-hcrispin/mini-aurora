package Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "Main.Repositories")
public class MiniAurora {
    public static void main (String[] args) {
        SpringApplication.run(MiniAurora.class, args);
    }
}