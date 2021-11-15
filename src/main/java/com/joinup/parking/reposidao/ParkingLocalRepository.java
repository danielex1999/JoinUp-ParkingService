package com.joinup.parking.reposidao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.joinup.parking.models.ParkingLocal;

public interface ParkingLocalRepository extends JpaRepository<ParkingLocal, Integer>{
}
