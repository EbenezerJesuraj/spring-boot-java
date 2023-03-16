package main.java.com.rest.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.REST;

@SpringBootApplication
public class TestApplication {


    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        SpringApplication.run(REST.class, args); //Linking Rest-Service to the Test Application runner..
        
    }
}
