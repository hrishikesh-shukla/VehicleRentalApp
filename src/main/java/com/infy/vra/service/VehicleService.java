package com.infy.vra.service;

import java.util.List;

import com.infy.vra.entity.BookVehicle;
import com.infy.vra.entity.Vehicle;

public interface VehicleService {
	List<Vehicle> getAllVehicle();

	Vehicle saveVehicle(Vehicle vehicle);

	BookVehicle bookVehicle(BookVehicle bookVehicle);

	List<BookVehicle> getVehicleReport();

}
