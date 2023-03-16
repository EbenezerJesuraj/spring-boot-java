package main.java.com.rest.springboot;


import java.lang.System.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rest.REST;

@SpringBootApplication
public class TestApplication {

    private static final Logger log = LoggerFactory.getLogger(TestApplication.class);
    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        SpringApplication.run(REST.class, args); //Linking Rest-Service to the Test Application runner..
        
    }
}
