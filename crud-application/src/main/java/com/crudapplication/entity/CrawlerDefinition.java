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
@Table(name = "crawlerdefinition")@Entity
public class CrawlerDefinition {

	@Id
	@GeneratedValue
	private UUID ID;

	private String Sitename;

	private String FieldName1;

    private String FieldName2;

    private String FieldName3;

    private String FieldName4;

	@OnetoMany(fetch = FetchType.LAZY) // Since, one crawler definition can have many crawlerdata entries..
    @JoinColumn(name = "CrawlerID")

}