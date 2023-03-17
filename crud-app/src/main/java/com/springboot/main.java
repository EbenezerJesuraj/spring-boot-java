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
        CRUD obj = new CRUD();
        /* 
        Scanner myObj = new Scanner(System.in);
        String userInput;
    
        System.out.println("Enter the number"); 
        userInput = myObj.nextLine();   
        System.out.println("Num is: " + userInput); 
        args[9] = userInput;
        
        if(args[9] == "1"){

            Scanner id = new Scanner(System.in);
            System.out.println("Enter ID: ");
            // getting user input's breaks the running of the program..
            userInput = myObj.nextLine();   
            System.out.println("ID is:" +userInput);
            args=null;
            args[0] = userInput;
            */
            CRUD.createCrawlerData(args);

        }
        //args[9]=3;
        
        
        //CRUD.readCrawlerData();
        //SpringApplication.run(CRUD.class, args); //Linking Rest-Service to the Test Application runner..
    }