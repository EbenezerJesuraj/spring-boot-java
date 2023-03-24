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
@Table(name = "crawlerdata")
public class CrawlerData {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	//@Column(nullable = false)
    private Long crawlerId; 	// foreign key mapping
	@Column(nullable = false)
	private String productURL;
	@Column(nullable = false)
	private String value1;
	@Column(nullable = false)
    private String value2;
	@Column(nullable = false)
    private String value3;
	@Column(nullable = false)
    private String value4;

}

//public static final QUser crawlerdata = new QUser("crawlerData");