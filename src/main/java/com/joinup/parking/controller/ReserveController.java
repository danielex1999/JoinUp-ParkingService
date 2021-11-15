package com.joinup.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joinup.parking.models.ReserveService;
import com.joinup.parking.services.JoinUpServices;

@RestController
@RequestMapping("/ReserveService")
public class ReserveController {
	@Autowired
	public JoinUpServices service;

	@PostMapping("/Add")
	public ReserveService AddService(@RequestBody ReserveService reserveservice) {
		return service.AddService(reserveservice);
	}

}
