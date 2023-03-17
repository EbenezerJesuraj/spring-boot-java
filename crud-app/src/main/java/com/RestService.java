package com;

//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;

//import main.java.com.rest.springboot.services.CRUD;
//import main.java.com.rest.springboot.services.CRUD.Logger;
//import main.java.com.rest.springboot.services.CRUD.LoggerFactory;

/* 
@SpringBootApplication
public class REST{

	private static final String HTTP_LOCALHOST_8080_API_SPRING_DATA_REST_CRUD = "http://localhost:8081/api/spring-data-rest-crud";
	private static final Logger log = LoggerFactory.getLogger(REST.class);

	public static void main(String[] args) {
		SpringApplication.run(CRUD.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate)
		return args -> {
			Quote quote = restTemplate.getForObject(
					HTTP_LOCALHOST_8080_API_SPRING_DATA_REST_CRUD, Quote.class);
			log.info(quote.toString());
		};
	}
	
}

*/