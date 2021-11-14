package com.joinup.parking.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FavoritePlaces {
	@Id
	private int id;
	@OneToOne
	private Users user_id;
	@OneToOne
	private ParkingLocal parking_id;
	public FavoritePlaces(int id, Users user_id, ParkingLocal parking_id) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.parking_id = parking_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public ParkingLocal getParking_id() {
		return parking_id;
	}
	public void setParking_id(ParkingLocal parking_id) {
		this.parking_id = parking_id;
	}
	
	
}
