package main.java.com.rest.springboot.services.CRUD;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CRUD {
    
    private static final Logger log = LoggerFactory.getLogger(CRUD.class);

    

    public static void createCrawlerData(string[] args){
        CrawlerData CrawlerData;
        main.java.com.rest.springboot.services.CRUD.CrawlerData.ID = args[0];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.CrawlerID = args[1];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.ProductURL = args[2];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value1 = args[3];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value2 = args[4];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value3 = args[5];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value4 = args[6];
    }

    public static void createCrawlerDefinition(string[] args){
        CrawlerDefinition CrawlerDefinition;
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.ID = args[0];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.Sitename = args[1];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName1 = args[2];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName2 = args[3];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName3 = args[4];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName4 = args[5];
    }
    /**
     * @return
     */
    public static CrawlerData readCrawlerData(){
        CrawlerData CrawlerDataResponse;
        CrawlerDataResponse.ID = CrawlerData.ID;
        CrawlerDataResponse.CrawlerID = CrawlerData.CrawlerID;
        CrawlerDataResponse.ProductURL = CrawlerData.ProductURL;
        CrawlerDataResponse.Value1 = CrawlerData.Value1;
        CrawlerDataResponse.Value2 = CrawlerData.Value2;
        CrawlerDataResponse.Value3 = CrawlerData.Value3;
        CrawlerDataResponse.Value4 = CrawlerData.Value4;
        
        return CrawlerDataResponse;

    }

    /**
     * @return
     */
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
        main.java.com.rest.springboot.services.CRUD.CrawlerData.ID = args[0];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.CrawlerID = args[1];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.ProductURL = args[2];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value1 = args[3];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value2 = args[4];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value3 = args[5];
        main.java.com.rest.springboot.services.CRUD.CrawlerData.Value4 = args[6];
    }

    public static void updateCrawlerDefinition(string[] args){
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.ID = args[0];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.Sitename args[1];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName1= args[2];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName2 = args[3];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName3 = args[4];
        main.java.com.rest.springboot.services.CRUD.CrawlerDefinition.FieldName4 = args[5];
    }
    /**
     * @param ID
     */
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

	public static void main(String[] args) {
		SpringApplication.run(CRUD.class, args);
        system.out.println("1 - createCrawlerData")
        system.out.println("2 - createCrawlerDefinition")
        system.out.println("3 - readCrawlerData")
        system.out.println("4 - readCrawlerDefinition")
        system.out.println("5 - updateCrawlerData)
	}


}
