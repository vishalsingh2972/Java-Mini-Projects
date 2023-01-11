package com.infy.rentacar.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "rental")
public class Rental {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer rentalId;
	private String carType;
	private LocalDate bookingStartDate;
	private Integer duration;
	private String customerName;
	private Long mobileNumber;
	public Integer getRentalId() {
		return rentalId;
	}
	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public LocalDate getBookingStartDate() {
		return bookingStartDate;
	}
	public void setBookingStartDate(LocalDate bookingStartDate) {
		this.bookingStartDate = bookingStartDate;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
