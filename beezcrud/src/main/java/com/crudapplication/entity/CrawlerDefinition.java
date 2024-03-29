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

/*
public class CrawlerDefinition {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
	@Column(nullable = false)
	private String Sitename;
	@Column(nullable = false)
	private String FieldName1;
	@Column(nullable = false)
    private String FieldName2;
	@Column(nullable = false)
    private String FieldName3;
	@Column(nullable = false)
    private String FieldName4;
}
*/

	//@OnetoMany(fetch = FetchType.LAZY) // Since, one crawler definition can have many crawlerdata entries..
    //@JoinColumn(name = "CrawlerID")

