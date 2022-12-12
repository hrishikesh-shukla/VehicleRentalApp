package com.infy.vra.utils;

import org.springframework.stereotype.Component;

import com.infy.vra.entity.Vehicle;
import com.infy.vra.exception.AddVehicleException;

@Component
public class AddVehicleValidation {

	public void validate(Vehicle vehicle) throws Exception {

		String matcher = "^[A-Z]{2}[ -][0-9]{1,2}(?: [A-Z])?(?: [A-Z]*)? [0-9]{4}$";

		if (!vehicle.getRegNo().matches(matcher)) {
			throw new AddVehicleException("Registration number is invalid!");
		}

	}

}
