package com.joinup.parking.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joinup.parking.models.ParkingLocal;
import com.joinup.parking.reposidao.ParkingLocalRepository;

@Service
public class JoinUpServicesImplement implements JoinUpServices {
	@Autowired
	private ParkingLocalRepository repo;

	@Override
	public ParkingLocal AddParking(ParkingLocal parkinglocal) {
		parkinglocal.getCatalogservices().forEach(service->{
			service.setParkingLocal(parkinglocal);
		});
		return repo.save(parkinglocal);
	}
	@Override
	public List<ParkingLocal> ShowAllParking() {
		return repo.findAll();
	}
}
