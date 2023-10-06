package it.SpringDataJPA.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Spring Boot";
    }

    //wrapping spring boot code
    @RequestMapping("/goodbye")
    public String goodbyeWorld() {
        return "Goodbye from Spring Boot";
    }
}
