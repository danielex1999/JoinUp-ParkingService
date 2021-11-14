package com.joinup.parking.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
@Id
private int id;
private String name;
private String lastname;
private int number;
private String mail;

public Users(int id, String name, String lastname, int number, String mail) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
	this.number = number;
	this.mail = mail;
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

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}


}
