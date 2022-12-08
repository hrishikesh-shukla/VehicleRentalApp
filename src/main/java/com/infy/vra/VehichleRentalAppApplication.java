package com.infy.vra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.vra.entity.Vehicle;
import com.infy.vra.repository.VehicleRepository;

@SpringBootApplication
public class VehichleRentalAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VehichleRentalAppApplication.class, args);
	}

	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Vehicle vehicle1= new Vehicle("B101","1","car","ram" ,"400" , "30","petrol", "decription ");
		vehicleRepository.save(vehicle1);
		
	}

}
