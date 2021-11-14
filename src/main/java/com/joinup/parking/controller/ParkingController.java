package com.joinup.parking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joinup.parking.models.ParkingLocal;
import com.joinup.parking.services.JoinUpServices;

@RestController
@RequestMapping("/Parkinglocal")
public class ParkingController {
	@Autowired
	public JoinUpServices service;
	@PostMapping("/Add")
	public ParkingLocal AddParking(@RequestBody ParkingLocal parkinglocal) {
		return service.AddParking(parkinglocal);
	}
	@GetMapping("/Showall")
	public List<ParkingLocal> ShowAllParking() {
		return service.ShowAllParking();
	}
}
