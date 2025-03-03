package org.example.repo_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepoBApplication {

    public static void main(String[] args) {
        System.out.println("Hello World ! This is repo B");
        SpringApplication.run(RepoBApplication.class, args);

    }

}
