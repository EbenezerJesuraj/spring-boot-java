package com.crudapplication.entity;
import java.util.List;
import java.util.Optional;
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
@Table(name = "crawlerdefinition")
public class CrawlerDefinition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID ID;
	@Column(nullable = false, unique = true)
	private String Sitename;
	@Column(nullable = false)
	private String FieldName1;
	@Column(nullable = false)
    private String FieldName2;
	@Column(nullable = false)
    private String FieldName3;
	@Column(nullable = false)
    private String FieldName4;
	@Column(nullable = false)
	public void setId(Long crawlerDefinitionId) {
	}

	public CrawlerDefinition save(CrawlerDefinition crawlerDefinition) {
		return null;
	}

    public Optional<CrawlerDefinition> findById(Long crawlerDefinitionId) {
        return null;
    }

    public List<CrawlerDefinition> findAll() {
        return null;
    }

    public Long getId() {
        return null;
    }

    public Object getFirstName() {
        return null;
    }

    public Object getLastName() {
        return null;
    }

    public Object getEmail() {
        return null;
    }

    public void setFirstName(Object firstName) {
    }

    public void setLastName(Object lastName) {
    }

    public void setEmail(Object email) {
    }

    public void deleteById(Long crawlerDefinitionId) {
    }

	@OnetoMany(fetch = FetchType.LAZY) // Since, one crawler definition can have many crawlerdata entries..
    @JoinColumn(name = "CrawlerID")

}