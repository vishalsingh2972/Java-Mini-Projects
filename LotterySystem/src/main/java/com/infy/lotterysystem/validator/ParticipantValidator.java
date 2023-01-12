package com.infy.lotterysystem.validator;

import com.infy.lotterysystem.dto.ParticipantDTO;
import com.infy.lotterysystem.exception.LotteryBookingException;

public class ParticipantValidator {

	public ParticipantValidator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void validateParticipant(ParticipantDTO participantDTO) throws LotteryBookingException
	{
		if(!isValidAge(participantDTO.getAge())){
//			if(isValidAge(participantDTO.getAge()) == false){
			throw new LotteryBookingException("ParticipantValidator.Invalid_Age");
		}


	}
	public static Boolean isValidAge(Integer age)
	{

		if(age < 18){
			return false;
		}
		else {
			return true;
		}


	}
	
}
