package com.WSI08I.semTaskWSI08I.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class games {
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private int id;
	  private String name;
	  private String developer;
	  private String genre;
	  private String descrtiption;
	  
	  
	public String getDescrtiption() {
		return descrtiption;
	}
	public void setDescrtiption(String descrtiption) {
		this.descrtiption = descrtiption;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "games [id=" + id + ", name=" + name + ", developer=" + developer + ", genre=" + genre
				+ ", descrtiption=" + descrtiption + "]";
	}
	
	
	  
}
