package com.infy.rentacar.validator;

import com.infy.rentacar.dto.RentalDTO;
import com.infy.rentacar.exception.RentACarException;

public class Validator {
	public Validator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void validate(RentalDTO rentalDTO) throws RentACarException {
		if (!isValidContactNumber(rentalDTO.getMobileNumber())) {     //mobileNumber method present in rentalDTO.java

			throw new RentACarException("Validator.INVALID_CONTACT");
		}
	}
	public static Boolean isValidContactNumber(Long mobileNumber)
	{
		String regex = "[0-9]{10}";

		if(mobileNumber.toString().matches(regex)){ //Need to use toString as Long is primitive so need to convert  that as string type; Basically converting mobileNumber which is Long to string type and then comparing it with a String regex
			return true;
		}
		else {
			return false;
		}
	}
	
}
