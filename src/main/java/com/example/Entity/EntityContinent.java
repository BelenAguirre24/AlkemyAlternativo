package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lonbok.Getter;
import lonbok.Setter;

@Entity
@Table (name ="continent")
@Getter
@Setter
public class EntityContinent {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	 
	private Long id;
	private String image;
	private String denomination;
	
}

