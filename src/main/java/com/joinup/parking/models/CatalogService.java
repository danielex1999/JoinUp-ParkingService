package com.joinup.parking.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CatalogService {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_service;
	private double price;
	private String type_service;
	@ManyToOne
	@JoinColumn(name = "ID_PARKINGLOCAL")
	@JsonIgnore
	private ParkingLocal parkingLocal;

	public CatalogService() {
		super();
	}

	public CatalogService(int id_service, double price, String type_service, ParkingLocal parkingLocal) {
		super();
		this.id_service = id_service;
		this.price = price;
		this.type_service = type_service;
		this.parkingLocal = parkingLocal;
	}

	public int getId_service() {
		return id_service;
	}

	public void setId_service(int id_service) {
		this.id_service = id_service;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType_service() {
		return type_service;
	}

	public void setType_service(String type_service) {
		this.type_service = type_service;
	}

	public ParkingLocal getParkingLocal() {
		return parkingLocal;
	}

	public void setParkingLocal(ParkingLocal parkingLocal) {
		this.parkingLocal = parkingLocal;
	}

}
