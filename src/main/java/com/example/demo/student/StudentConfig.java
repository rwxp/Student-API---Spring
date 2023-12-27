package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

     @Bean
     CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
//            Student mariam = new Student( "Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5 ));
//            Student sebastian  = new Student( "Sebastian", "sdrivert@gmail.com", LocalDate.of(2000, Month.MARCH, 18 ));
//            Student luciana  = new Student( "Luciana", "luchita17@gmail.com", LocalDate.of(2015, Month.APRIL, 17 ));
//            repository.saveAll(
//                    List.of(mariam, sebastian, luciana)
//            );
         };

    }

}
