package com.infy.moviebooking.validator;

import com.infy.moviebooking.dto.MovieBookingDTO;
import com.infy.moviebooking.exception.MovieBookingException;

public class MovieBookingValidator {

	private MovieBookingValidator()
	{
		
	}
	public static void validate(MovieBookingDTO movieBookingDTO) throws MovieBookingException
	{

		if(!isValidPaymentType(movieBookingDTO.getPaymentType()))  {

			throw new MovieBookingException("Validator.INVALID_PAYMENT_TYPE");

	}


		if(!isValidCustomerPhoneNo(movieBookingDTO.getCustomerPhoneNo()))  {

			throw new MovieBookingException("Validator.INVALID_CUSTOMER_PHONE_NO");

	}

	}
	public static Boolean isValidPaymentType(String paymentType) throws MovieBookingException
	{
		String paymentType1 = "Card";
		String paymentType2 = "Wallet";
		String paymentType3 = "NetBanking";

		if(paymentType.equals(paymentType1) || paymentType.equals(paymentType2) || paymentType.equals(paymentType3)){
			return true;
		}
		return false;
		
	}
	public static Boolean isValidCustomerPhoneNo(Long customerPhoneNo) throws MovieBookingException
	{
		String regexp = "[3-9]{1}[0-9]{9}";
		
			if(customerPhoneNo.toString().matches(regexp)){
				return true;
			}
			else {
				return false;
			}
		
	}
}
