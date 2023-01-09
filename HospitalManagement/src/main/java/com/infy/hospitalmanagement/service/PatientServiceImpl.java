package com.infy.hospitalmanagement.service;

import java.util.ArrayList;
import java.util.List;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.entity.Patient;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;
import com.infy.hospitalmanagement.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value  = "patientService")
@Transactional
public class PatientServiceImpl  implements PatientService{

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public List<PatientDTO> getListOfPatients(String diagnosis) throws PatientAdmissionException {

//		List<Patient> patient = patientRepository.findByDiagnosis(diagnosis);
//		if(patient.isEmpty()){
//			throw new PatientAdmissionException("PatientService.PATIENT_UNAVAILABLE");
//		}
//		List<PatientDTO> dtolist = new ArrayList<>();
//		patient.stream().forEach(x->dtolist.add(new PatientDTO().prepareDTO(x)));
//		dtolist.sort((x1,x2)->x1.getAdmissionDate().compareTo(x2.getAdmissionDate()));
//		return dtolist;

		return null;
	}

	@Override
	public PatientDTO admitPatient(PatientDTO patientDTO) throws PatientAdmissionException {

//		PatientValidator.validatePatient(patientDTO);
//		Patient patient=PatientDTO.prepareEntity(patientDTO);
//		patient=patientRepository.save(patient);
//		patientDTO.setPatientId(patient.getPatientId());
//		return patientDTO;

		return null;
	}
}
