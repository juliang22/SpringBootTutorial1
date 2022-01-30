package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student julian = new Student(
                    "Julian",
                    LocalDate.of(1998, Month.AUGUST, 22),
                    "juliang222@gmail.com"
            );
            Student alex = new Student(
                    "Alex",
                    LocalDate.of(1997, Month.AUGUST, 21),
                    "alex111@gmail.com"
            );
            studentRepository.saveAll(
                    List.of(julian,alex)
            );
        };
    }
}
