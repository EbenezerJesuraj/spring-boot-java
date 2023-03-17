package main.java.com.rest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.REST;

@SpringBootApplication
public class main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        system.println.out("The Application has entered the main spring-boot program and is waiting for the next stage to happen!!");
        SpringApplication.run(main.class, args);
        SpringApplication.run(REST.class, args); //Linking Rest-Service to the Test Application runner..
    }
}