package com.infy.vra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.vra.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {

}
