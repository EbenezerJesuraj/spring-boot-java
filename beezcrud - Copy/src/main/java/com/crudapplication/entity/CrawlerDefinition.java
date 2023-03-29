package com.crudapplication.entity;

//import jakarta.persistence.*;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "crawlerdefinition")
public class CrawlerDefinition {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(nullable = false)
	private String siteName;
	@Column(nullable = false)
	private String fieldName1;
	@Column(nullable = false)
    private String fieldName2;
	@Column(nullable = false)
    private String fieldName3;
	@Column(nullable = false)
    private String fieldName4;
}


	// Foreign Key Mapping has been temporarily disabled due to issues with getter setter functions..

	//@OnetoMany
	//private CrawlerData crawlerData;
	//@JoinColumn(name = "CrawlerId")
    
	
	//public static final QUser crawlerDefinition = new QUser("crawlerDefinition")