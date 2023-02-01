package com.infy.hospitalmanagement.validator;

import java.time.LocalDate;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;

public class PatientValidator {

	public PatientValidator() {
		super();
		// TODO Auto-generated constructor stub
	}
   public static void validatePatient(PatientDTO patientDTO) throws PatientAdmissionException
   {
	   if(!isValidDateOfBirth(patientDTO.getDateOfBirth())){
           throw new PatientAdmissionException("PatientValidator.INVALID_DOB");
       }
   }
   public static Boolean isValidDateOfBirth(LocalDate dateOfBirth) throws PatientAdmissionException {
       if (dateOfBirth.isAfter(LocalDate.now())) {
           return false;
       } else if(LocalDate.now().getYear()-dateOfBirth.getYear()>100){
           return false;
       }
           else{
               return true;
       }
   }


}
