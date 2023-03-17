package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.services.CRUD.CRUD;

//import org.yaml.snakeyaml.scanner.Scanner;
import java.io.*;
import java.util.Scanner;

//import com.springboot.services.CRUD.CRUD;
//import com.springboot.services.CRUD.CrawlerData;
//import com.rest.REST;

@SpringBootApplication
public class main {

    public static Object java;

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("The Application has entered the main spring-boot program and is waiting for the next stage to happen!!");

        System.out.println("1 - createCrawlerData");
        System.out.println("2 - createCrawlerDefinition");
        System.out.println("3 - readCrawlerData");
        System.out.println("4 - readCrawlerDefinition");
        System.out.println("5 - updateCrawlerData");
        
        System.out.println("Waiting for user's numeric input:");
        
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        args[9] = num;
        
        if(args[9] == "1"){
            System.out.println("Enter ID: ");
            Scanner id = new Scanner(System.in);
            args=null;
            args[0] = "10001";
            CRUD.createCrawlerData(args);

        }
        //args[9]=3;
        CRUD obj = new CRUD();
        
        CRUD.readCrawlerData();
        //SpringApplication.run(CRUD.class, args); //Linking Rest-Service to the Test Application runner..
    }


}