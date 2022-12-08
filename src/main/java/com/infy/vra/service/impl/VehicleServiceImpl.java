package com.infy.vra.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.vra.entity.BookVehicle;
import com.infy.vra.entity.Vehicle;
import com.infy.vra.repository.BookVehicleRepository;
import com.infy.vra.repository.VehicleRepository;
import com.infy.vra.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	Logger log=LoggerFactory.getLogger(VehicleServiceImpl.class);
	
	@Autowired
	private VehicleRepository vehicleRepo;
	
	@Autowired
	private BookVehicleRepository bookVehicleRepo;
	

	@Override
	public List<Vehicle> getAllVehicle() {
		
		return vehicleRepo.findAll();
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		
		return vehicleRepo.save(vehicle);
	}
	@Override
	public BookVehicle bookVehicle(BookVehicle bookVehicle) {
		
		return bookVehicleRepo.save(bookVehicle);
	}
	@Override
	public List<BookVehicle> getVehicleReport() {
		
		return bookVehicleRepo.findAll();
	}

}
