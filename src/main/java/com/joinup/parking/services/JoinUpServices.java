package com.joinup.parking.services;

import java.util.List;

import com.joinup.parking.models.ParkingLocal;

public interface JoinUpServices {
	ParkingLocal AddParking(ParkingLocal parkinglocal);
	List<ParkingLocal> ShowAllParking();
}
