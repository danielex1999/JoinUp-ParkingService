package com.joinup.parking.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PARKINGLOCAL")
public class ParkingLocal {
	@Id @Column(name = "ID_PARKINGLOCAL")
	private int id;
	private String name;
	@Column(length = 10000)
	private String description;
	private double length;
	private double latitude;
	private Date start_attention;
	private Date end_attention;
	@OneToOne
	private ParkingType parking_type;
	@OneToMany(mappedBy = "parkingLocal", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REMOVE }, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<CatalogService> catalogservices;

	public ParkingLocal() {
		super();
	}

	public ParkingLocal(int id, String name, String description, double length, double latitude, Date start_attention,
			Date end_attention, ParkingType parking_type, List<CatalogService> catalogservices) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.length = length;
		this.latitude = latitude;
		this.start_attention = start_attention;
		this.end_attention = end_attention;
		this.parking_type = parking_type;
		this.catalogservices = catalogservices;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Date getStart_attention() {
		return start_attention;
	}

	public void setStart_attention(Date start_attention) {
		this.start_attention = start_attention;
	}

	public Date getEnd_attention() {
		return end_attention;
	}

	public void setEnd_attention(Date end_attention) {
		this.end_attention = end_attention;
	}

	public ParkingType getparking_type() {
		return parking_type;
	}

	public void setParkingtype(ParkingType parking_type) {
		this.parking_type = parking_type;
	}

	public List<CatalogService> getCatalogservices() {
		return catalogservices;
	}

	public void setCatalogservices(List<CatalogService> catalogservices) {
		this.catalogservices = catalogservices;
	}

}
