package com.example.RFT.Teacher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TeacherConfig {


    CommandLineRunner commandLineRunner(TeacherRepository repository) {
        return args -> {
            Teacher bela = new Teacher(

                    "Bela",
                    32,
                    1L,
                    "RFT"

            );
            Teacher janos = new Teacher(

                    "Dani",
                    12,
                    2L,
                    "Porg_tech"

            );
            repository.deleteAll(
                    List.of(bela, janos)
            );
        };
    }

}
