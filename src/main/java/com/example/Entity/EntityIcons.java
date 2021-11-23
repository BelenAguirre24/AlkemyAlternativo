package com.example.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import lonbok.Getter;
import lonbok.Setter;


@Entity
@Table (name ="Icons")
@Getter
@Setter
public class EntityIcons {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	 
	private Long id;
	private String image;
	private String denomination;
	@Column (name = "creation_date")
	@DateTimeFormat (pattern = "yyyy/MM/dd")
	private LocalDate creationDate;
	private Long height;
	private String history;
	@ManyToMany (mappedBy = "icons" , cascade= CascadeType.ALL)
	private List <EntityCountry> country = new ArrayList<>();
	// Add and remove country//
	public void addcountry (EntityCountry Country) {country.add(Country);}
	public void removecountry(EntityCountry Country) {country.remove(Country);}
}
