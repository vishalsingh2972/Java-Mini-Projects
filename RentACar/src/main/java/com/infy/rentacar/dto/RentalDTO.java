package com.infy.rentacar.dto;

import java.time.LocalDate;

import com.infy.rentacar.entity.Rental;

import javax.validation.constraints.*;

public class RentalDTO {

	private Integer rentalId;

	@NotNull(message = "{rental.cartype.absent}")
	@Pattern(regexp = "(Automatic | Electric | Manual)", message = "{rental.cartype.invalid}")
	private String carType;

	@NotNull(message = "{rental.bookingdate.absent}")
	@FutureOrPresent(message = "{rental.bookingdate.invalid}")
	private LocalDate bookingStartDate;

	@NotNull(message = "{rental.customername.absent}")
	@Min(value = 1,  message = "{rental.duration.invalid}")
	@Max(value = 30,  message = "{rental.duration.invalid}")
	private Integer duration;

	@NotNull(message = "{rental.duration.absent}")
	@Pattern(regexp = "[A-Z][a-z]+(\\s[A-Z][a-z]+)*", message = "{rental.customername.invalid}")
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
	public static RentalDTO prepareDTO(Rental rental)
	{
		RentalDTO rentalDTO=new RentalDTO();
		rentalDTO.setRentalId(rental.getRentalId());
		rentalDTO.setCarType(rental.getCarType());
		rentalDTO.setBookingStartDate(rental.getBookingStartDate());
		rentalDTO.setDuration(rental.getDuration());
		rentalDTO.setCustomerName(rental.getCustomerName());
		rentalDTO.setMobileNumber(rental.getMobileNumber());
		return rentalDTO;
		
	}
	public static Rental prepareEntity(RentalDTO rentalDTO)
	{
		Rental rental=new Rental();
		rental.setCarType(rentalDTO.getCarType());
		rental.setBookingStartDate(rentalDTO.getBookingStartDate());
		rental.setDuration(rentalDTO.getDuration());
		rental.setCustomerName(rentalDTO.getCustomerName());
		rental.setMobileNumber(rentalDTO.getMobileNumber());
		return rental;
		
		
	}
	
}
