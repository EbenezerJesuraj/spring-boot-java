package com.springboot.services.CRUD;

//import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.main;

//import org.springboot.entity.CrawlerDataJPAEntity;

@SpringBootApplication
public class CRUD {
    
    private static final Logger log = LoggerFactory.getLogger(CRUD.class);

    /* 
    public static void main(String[] args) {
		//SpringApplication.run(CRUD.class, args);
       
	}
     
    */

    
    public static void createCrawlerData(String[] strings){
        
        System.out.println("The application has entered into the createCrawlerData stage");
        CrawlerData CrawlerData;
        com.springboot.services.CRUD.CrawlerData.ID = strings[0];
        com.springboot.services.CRUD.CrawlerData.CrawlerID = null;
        com.springboot.services.CRUD.CrawlerData.ProductURL = null;
        com.springboot.services.CRUD.CrawlerData.Value1 = null;
        com.springboot.services.CRUD.CrawlerData.Value2 = null;
        com.springboot.services.CRUD.CrawlerData.Value3 = null;
        com.springboot.services.CRUD.CrawlerData.Value4 = null;
    }
    /*
    public static void createCrawlerDefinition(string[] args){
        CrawlerDefinition CrawlerDefinition;
        main.java.com.springboot.services.CRUD.CrawlerDefinition.ID = args[0];
        main.java.com.springboot.services.CRUD.CrawlerDefinition.Sitename = args[1];
        main.java.com.springboot.services.CRUD.CrawlerDefinition.FieldName1 = args[2];
        main.java.com.springboot.services.CRUD.CrawlerDefinition.FieldName2 = args[3];
        main.java.com.springboot.services.CRUD.CrawlerDefinition.FieldName3 = args[4];
        main.java.com.springboot.services.CRUD.CrawlerDefinition.FieldName4 = args[5];
    }
   */
    //public static CrawlerData readCrawlerData(){
        public static void readCrawlerData(){
            System.out.println("The application has entered into readCrawler function: ");
        
        CrawlerData CrawlerDataResponse = new CrawlerData();
        System.out.printf("ID: ", CrawlerDataResponse.ID);
        System.out.printf("CrawlerID: " ,CrawlerDataResponse.CrawlerID);
        System.out.printf("ProductURL: " , CrawlerDataResponse.ProductURL);
        System.out.printf("Value 1: " , CrawlerDataResponse.Value1);
        System.out.printf("Value 2: " , CrawlerDataResponse.Value2);
        System.out.printf("Value 3: " , CrawlerDataResponse.Value3);
        System.out.printf("Value 4: " , CrawlerDataResponse.Value4);
        

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

    public static void updateCrawlerData(string[] args){
        main.java.com.springboot.services.CRUD.CrawlerData.ID = args[0];
        main.java.com.springboot.services.CRUD.CrawlerData.CrawlerID = args[1];
        main.java.com.springboot.services.CRUD.CrawlerData.ProductURL = args[2];
        main.java.com.springboot.services.CRUD.CrawlerData.Value1 = args[3];
        main.java.com.springboot.services.CRUD.CrawlerData.Value2 = args[4];
        main.java.com.springboot.services.CRUD.CrawlerData.Value3 = args[5];
        main.java.com.springboot.services.CRUD.CrawlerData.Value4 = args[6];
    }

    public static void updateCrawlerDefinition(string[] args){
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.ID = args[0];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.Sitename args[1];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName1= args[2];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName2 = args[3];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName3 = args[4];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName4 = args[5];
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