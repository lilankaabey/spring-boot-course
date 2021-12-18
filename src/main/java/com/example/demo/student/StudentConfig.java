package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marian = new Student(
                     "Marian", "mail@email.com", LocalDate.of(1993,9,06)
            );

            Student alex = new Student(
                     "Marian", "alex@email.com", LocalDate.of(1994,6,06)
            );

            repository.saveAll(List.of(marian, alex));
        };
    }
}
