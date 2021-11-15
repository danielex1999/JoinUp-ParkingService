package com.joinup.parking.services;

import java.util.List;

import com.joinup.parking.models.ParkingLocal;
import com.joinup.parking.models.ReserveService;

public interface JoinUpServices {
	ParkingLocal AddParking(ParkingLocal parkinglocal);

	List<ParkingLocal> ShowAllParking();
	
	ReserveService AddService(ReserveService reserveservice);
}
