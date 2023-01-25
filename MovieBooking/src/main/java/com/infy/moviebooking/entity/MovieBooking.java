package com.infy.moviebooking.entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "movie_booking")
public class  MovieBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	private String movieName;
	private String screenName;
	private LocalDate showDate;
	private Integer noOfSeats;
	private Double bookingAmount;
	private String paymentType;
	private Long customerPhoneNo;
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public Double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Long getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(Long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	
}
