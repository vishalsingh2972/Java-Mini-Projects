package com.infy.infytvseries.validator;

import java.time.LocalDate;

import com.infy.infytvseries.dto.UserDTO;
import com.infy.infytvseries.exception.SeriesBookingException;

public class UserValidator {
	
	public UserValidator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void validateUser(UserDTO userDTO) throws SeriesBookingException
	{

		if(!isValidRegDate(userDTO.getRegDate()))
//			if(isValidRegDate(userDTO.getRegDate()) == false )
		{
			throw new SeriesBookingException("Validator.INVALID_REG_DATE");
		}

	}

	public static Boolean isValidRegDate(LocalDate regDate) {

		if(regDate.isBefore(LocalDate.now()) || regDate.isAfter(LocalDate.now().plusDays(9))){
			return false;
		}
//		else if(regDate.isAfter(LocalDate.now().plusDays(9))){
//			return  false;
//		}

		else{
			return true;
		}

	}
}
