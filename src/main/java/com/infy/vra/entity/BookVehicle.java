package com.infy.vra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookVehicle {
	@Id
	private String bookingId;
	private String name;
	private String category;
	private String regNo;
	private String bookedFrom;
	private String bookedTo;
	private String totalRent;
	private String isPaymentReceived;

	public BookVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookVehicle(String bookingId, String name, String category, String regNo, String bookedFrom, String bookedTo,
			String totalRent, String isPaymentReceived) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.category = category;
		this.regNo = regNo;
		this.bookedFrom = bookedFrom;
		this.bookedTo = bookedTo;
		this.totalRent = totalRent;
		this.isPaymentReceived = isPaymentReceived;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getBookedFrom() {
		return bookedFrom;
	}

	public void setBookedFrom(String bookedFrom) {
		this.bookedFrom = bookedFrom;
	}

	public String getBookedTo() {
		return bookedTo;
	}

	public void setBookedTo(String bookedTo) {
		this.bookedTo = bookedTo;
	}

	public String getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(String totalRent) {
		this.totalRent = totalRent;
	}

	public String getIsPaymentReceived() {
		return isPaymentReceived;
	}

	public void setIsPaymentReceived(String isPaymentReceived) {
		this.isPaymentReceived = isPaymentReceived;
	}

}
