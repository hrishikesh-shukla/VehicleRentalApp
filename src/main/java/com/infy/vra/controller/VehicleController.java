package com.infy.vra.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.infy.vra.entity.BookVehicle;
import com.infy.vra.entity.Vehicle;
import com.infy.vra.service.VehicleService;
import com.infy.vra.utils.AddVehicleValidation;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@Autowired
	private AddVehicleValidation addVehicleValidation;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	// handler method to handle list of vehicle
	@GetMapping("/vehicles")
	public String getAllVehicle(Model model) {
		model.addAttribute("vehicles", vehicleService.getAllVehicle());
		return "vehicles";
	}

	@GetMapping("/vehicles/new")
	public String addNewVehicle(Model model) {
		// create add new vehicle object to handle vehicle data
		Vehicle vehicle = new Vehicle();
		model.addAttribute("vehicle", vehicle);
		return "add_new_vehicle";
	}

	@PostMapping("/vehicles")
	public String saveVehicle(@ModelAttribute("vehicle") Vehicle vehicle) throws Exception {
		vehicle.setId(UUID.randomUUID().toString());
		addVehicleValidation.validate(vehicle);
		vehicleService.saveVehicle(vehicle);
		return "redirect:/vehicles";

	}

	@GetMapping("/vehicles/book")
	public String bookVehicle(Model model) {
		// book a vehicle
		BookVehicle bookVehicle = new BookVehicle();
		model.addAttribute("bookVehicle", bookVehicle);
		return "book_vehicle";
	}

	@PostMapping("/vehicles/book")
	public String bookVehicle(@ModelAttribute("bookVehicle") BookVehicle bookVehicle) {
		bookVehicle.setBookingId(UUID.randomUUID().toString());
		vehicleService.bookVehicle(bookVehicle);
		return "redirect:/";
	}

	@GetMapping("/vehiclesInfo")
	public String getVehicleReport(Model model) {
		model.addAttribute("vehiclesInfo", vehicleService.getVehicleReport());
		return "report";
	}
}
