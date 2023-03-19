package com.crudapplication.entity;
import java.util.UUID;

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
	private UUID ID;
	@Column(nullable = false, unique = true)
    private UUID CrawlerID; 	// foreign key mapping
	@Column(nullable = false, unique = true)
	private String ProductURL;
	@Column(nullable = false)
	private String Value1;
	@Column(nullable = false)
    private String Value2;
	@Column(nullable = false)
    private String Value3;
	@Column(nullable = false)
    private String Value4;
	@Column(nullable = false)
}