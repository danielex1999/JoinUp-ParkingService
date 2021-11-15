package com.joinup.parking.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ReserveService {
	@Id
	private int reserva_id;
	@OneToOne
	private CatalogService service_id;
	private Date start_day;
	private Date final_day;
	private String brand;
	@OneToOne
	private Users user_id;
	private String model;
	private String placa;
	private int numvolt;
	private double money;
	
	public ReserveService() {
	
	}
	public ReserveService(int reserva_id, CatalogService service_id, Date start_day, Date final_day, String brand,
			Users user_id, String model, String placa, int numvolt, double money) {
		super();
		this.reserva_id = reserva_id;
		this.service_id = service_id;
		this.start_day = start_day;
		this.final_day = final_day;
		this.brand = brand;
		this.user_id = user_id;
		this.model = model;
		this.placa = placa;
		this.numvolt = numvolt;
		this.money = money;
	}
	public int getReserva_id() {
		return reserva_id;
	}
	public void setReserva_id(int reserva_id) {
		this.reserva_id = reserva_id;
	}
	public CatalogService getService_id() {
		return service_id;
	}
	public void setService_id(CatalogService service_id) {
		this.service_id = service_id;
	}
	public Date getStart_day() {
		return start_day;
	}
	public void setStart_day(Date start_day) {
		this.start_day = start_day;
	}
	public Date getFinal_day() {
		return final_day;
	}
	public void setFinal_day(Date final_day) {
		this.final_day = final_day;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Users getUser_id() {
		return user_id;
	}
	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumvolt() {
		return numvolt;
	}
	public void setNumvolt(int numvolt) {
		this.numvolt = numvolt;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	
}
