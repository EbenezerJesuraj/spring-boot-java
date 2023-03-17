package com.springboot.services.CRUD;

//import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import org.springboot.entity.CrawlerDataJPAEntity;

@SpringBootApplication
public class CRUD {
    
    private static final Logger log = LoggerFactory.getLogger(CRUD.class);

    /* 
    public static void main(String[] strings) {
		//SpringApplication.run(CRUD.class, strings);
       
	}
     
    */

    CrawlerData CrawlerData = null;
    CrawlerDefinition CrawlerDefinition;

    public static void createCrawlerData(String[] strings){
        
        System.out.println("The application has entered into the createCrawlerData stage");
        
        com.springboot.services.CRUD.CrawlerData.ID = strings[1];
        com.springboot.services.CRUD.CrawlerData.CrawlerID = strings[2];
        com.springboot.services.CRUD.CrawlerData.ProductURL = strings[3];
        com.springboot.services.CRUD.CrawlerData.Value1 = strings[4];
        com.springboot.services.CRUD.CrawlerData.Value2 = strings[5];
        com.springboot.services.CRUD.CrawlerData.Value3 = strings[6];
        com.springboot.services.CRUD.CrawlerData.Value4 = strings[7];
    }
    
    public static void createCrawlerDefinition(String[] args){
    
        System.out.println("The application has entered into the createCrawlerDefinition stage");
    
        com.springboot.services.CRUD.CrawlerDefinition.ID = args[1];
        com.springboot.services.CRUD.CrawlerDefinition.Sitename = args[2];
        com.springboot.services.CRUD.CrawlerDefinition.FieldName1 = args[3];
        com.springboot.services.CRUD.CrawlerDefinition.FieldName2 = args[4];
        com.springboot.services.CRUD.CrawlerDefinition.FieldName3 = args[5];
        com.springboot.services.CRUD.CrawlerDefinition.FieldName4 = args[6];
    }
   
    //public static CrawlerData readCrawlerData(){
        public static void readCrawlerData(){
            System.out.println("The application has entered into readCrawler function: ");
        
        CrawlerData CrawlerDataResponse = new CrawlerData();
        System.out.printf("ID: ", com.springboot.services.CRUD.CrawlerData.ID);
        System.out.printf("CrawlerID: " ,com.springboot.services.CRUD.CrawlerData.CrawlerID);
        System.out.printf("ProductURL: " , com.springboot.services.CRUD.CrawlerData.ProductURL);
        System.out.printf("Value 1: " , com.springboot.services.CRUD.CrawlerData.Value1);
        System.out.printf("Value 2: " , com.springboot.services.CRUD.CrawlerData.Value2);
        System.out.printf("Value 3: " , com.springboot.services.CRUD.CrawlerData.Value3);
        System.out.printf("Value 4: " , com.springboot.services.CRUD.CrawlerData.Value4);
        

    }
    /* 
    public static CrawlerDefinition readCrawlerDefinition(){
        CrawlerDefinition CrawlerDefinitionResponse;
        CrawlerDefinitionResponse.ID = CrawlerDefinition.ID;
        CrawlerDefinitionResponse.Sitename = CrawlerDefinition.Sitename;
        CrawlerDefinitionResponse.FieldName1 = CrawlerDefinition.FieldName1;
        CrawlerDefinitionResponse.FieldName2 = CrawlerDefinition.FieldName2;
        CrawlerDefinitionResponse.FieldName3 = CrawlerDefinition.FieldName3;
        CrawlerDefinitionResponse.FieldName4 = CrawlerDefinition.FieldName4;
        
        return CrawlerDefinitionResponse;

    }
    
    public static void updateCrawlerData(string[] strings){
        main.java.com.springboot.services.CRUD.CrawlerData.ID = strings[0];
        main.java.com.springboot.services.CRUD.CrawlerData.CrawlerID = strings[1];
        main.java.com.springboot.services.CRUD.CrawlerData.ProductURL = strings[2];
        main.java.com.springboot.services.CRUD.CrawlerData.Value1 = strings[3];
        main.java.com.springboot.services.CRUD.CrawlerData.Value2 = strings[4];
        main.java.com.springboot.services.CRUD.CrawlerData.Value3 = strings[5];
        main.java.com.springboot.services.CRUD.CrawlerData.Value4 = strings[6];
    }

    public static void updateCrawlerDefinition(string[] strings){
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.ID = strings[0];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.Sitename strings[1];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName1= strings[2];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName2 = strings[3];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName3 = strings[4];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName4 = strings[5];
    }
   
    public static void deleteCrawlerData(string ID){

        if(CrawlerData.CrawlerID == ID)
        {
            main.java.com.rest.springboot.services.CRUD.CrawlerData.ID = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerData.CrawlerID = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerData.ProductURL = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerData.Value1 = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerData.Value2 = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerData.Value3 = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerData.Value4 = null;
        }
        else
            System.out.println("No CrawlerData found for the given ID");
       
    }

    public static void deleteCrawlerDefinition(string ID){

        if(CrawlerDefinition.CrawlerID == ID)
        {
            main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.ID = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.Sitename null;
            main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName1= null;
            main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName2 = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName3 = null;
            main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName4 = null;
        }
        else
            System.out.println("No CrawlerDefiniton found for the given ID");
    }

    */
	
}