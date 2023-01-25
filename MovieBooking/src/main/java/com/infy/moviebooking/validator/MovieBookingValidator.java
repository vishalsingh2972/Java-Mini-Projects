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
		String mob = customerPhoneNo.toString(); //converting long number to string format

		if(mob.length() == 10)
		{
			char c = mob.charAt(0); //character present at 1st index position of String mob
			Integer a = Character.getNumericValue(c);

			if((a <= 9) && (a >= 3)){
				return true;
			}
			else {
				return false;
			}
		}

		return false;
		
	}
}
