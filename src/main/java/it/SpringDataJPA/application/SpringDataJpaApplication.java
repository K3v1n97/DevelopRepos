package it.SpringDataJPA.application;

import it.SpringDataJPA.application.model.User;
import it.SpringDataJPA.application.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

//    private void insertUser(UserRepository repository) {
//        try {
//            repository.save(new User("pippo.franco@gmial.com", "pippopippo", "Pippo", "Franco", "12/06/1952"));
//            repository.save(new User("luisa.spadazzi@gmial.com", "luisa62", "Luisa", "Spadazzi", "25/04/1962"));
//            repository.save(new User("giuliolocapo@gmial.com", "giulio1972", "Giulio", "Lo Capo", "03/12/1972"));
//            repository.save(new User("serenadeluca@gmail.com", "sereserena", "Serena", "De Luca", "21/11/1991"));
//            repository.save(new User("lorenzabardi@gmial.com", "lorenza1768", "Lorenza", "Bardi", "17/08/1968"));
//
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Bean
//    public CommandLineRunner run(UserRepository repository) {
//        return (args -> {
////            insertUser(repository);
////            System.out.println(repository.findAll());
//
//            System.out.println(repository.getUserByLastNameContaining(" "));
//        });
//    }

}
