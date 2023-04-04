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

	public CrawlerData(Long crawlerId, String productURL, String value1, String value2, String value3, String value4) {

		this.crawlerId = crawlerId;
		this.productURL = productURL;
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;

	}
	//public static final QUser cd = new QUser("crawlerData");

}


//public static final QUser crawlerdata = new QUser("crawlerData");