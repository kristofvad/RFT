package com.example.RFT.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {


    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student maria = new Student(

                    "Maria",
                    35
            );
            Student dani = new Student(

                    "Dani",
                    12
            );

            repository.saveAll(
                    List.of(maria, dani)
            );
            Student marci = new Student(

                    "marci",
                    42
            );

            repository.saveAll(
                    List.of(maria, dani, marci)
            );
        };
    }
}
