package org.tnsif.main.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	
	@Id
   private Integer id;
   private String collegename;
   private String location;
   
   
   //setters and getters
   public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getCollegename() {
	return collegename;
}


public void setCollegename(String collegename) {
	this.collegename = collegename;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


//default const.
public College() {
  System.Out.println("Demonstration on SpringBoot-Rest API");
}


//parameterized const.
public College(Integer id, String collegename, String location) {
	super();
	this.id = id;
	this.collegename = collegename;
	this.location = location;
}


@Override
public String toString() {
	return "College [id=" + id + ", collegename=" + collegename + ", location=" + location + "]";
}
   
   
   
}
