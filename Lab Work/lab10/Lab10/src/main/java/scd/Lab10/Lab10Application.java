package scd.Lab10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Lab10Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab10Application.class, args);
    }
}
