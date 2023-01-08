package com.infy.hospitalmanagement.service;

import java.util.List;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;

public interface PatientService
{
	List<PatientDTO> getListOfPatients(String diagnosis) throws PatientAdmissionException;
	PatientDTO admitPatient(PatientDTO patientDTO) throws PatientAdmissionException;
}
