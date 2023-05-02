package de.neuefische.springcar;

import de.neuefische.springcar.controller.CarController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@RestController // This is a controller
public class SpringCarApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCarApplication.class, args);
    }

}
