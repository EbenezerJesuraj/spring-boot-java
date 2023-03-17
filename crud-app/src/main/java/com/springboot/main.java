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
        args[1] = "10002";
        args[2] = "10001";
        args[3] = "tulip";
        args[4] = "A1234568";
        args[5] = "A1234569";
        args[6] = "A1234560";
        args[7] = "A1234561";
        */
        CRUD.readCrawlerData();
        //CRUD.createCrawlerData(args);
        CRUD.readCrawlerData();

        /* 
        args[1] = "10001";
        args[2] = "bacardi";
        args[3] = "E1234567";
        args[4] = "E1234568";
        args[5] = "E1234569";
        args[6] = "E1234560";
        */

        //CRUD.createCrawlerDefinition(args);
        
        }
        
    }