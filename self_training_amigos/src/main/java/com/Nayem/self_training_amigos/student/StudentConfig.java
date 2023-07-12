package com.Nayem.self_training_amigos.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Nayem = new Student(
                    2L,
                    "Nayem",
                    "legend3073@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 29),
                    55
            );
            studentRepository.saveAll(
                    List.of(Nayem)
            );
        };
    }
}
