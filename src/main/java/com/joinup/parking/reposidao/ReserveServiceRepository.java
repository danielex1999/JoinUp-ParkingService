package com.joinup.parking.reposidao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joinup.parking.models.ReserveService;

public interface ReserveServiceRepository extends JpaRepository<ReserveService, Integer> {

}
