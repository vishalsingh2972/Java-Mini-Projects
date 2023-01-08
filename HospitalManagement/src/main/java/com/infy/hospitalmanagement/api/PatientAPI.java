package com.infy.hospitalmanagement.api;

import java.util.List;

import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.infy.hospitalmanagement.dto.PatientDTO;
import com.infy.hospitalmanagement.exception.PatientAdmissionException;
import com.infy.hospitalmanagement.service.PatientService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping(value = "/api")
@Validated
public class PatientAPI {

	@Autowired
	private PatientService patientService;

	@GetMapping(value = "/patients/{diagnosis}")
	public ResponseEntity<List<PatientDTO>>getPatientsByDiagnosis(@PathVariable @Valid @Pattern(regexp="[a-zA-Z0-9/s]+", message = "{patient.diagnosis.invalid}") String diagnosis) throws PatientAdmissionException{



		return null;
		
	}

	@PostMapping(value = "/patients")
	public ResponseEntity<PatientDTO>admitPatient(@Valid @RequestBody  PatientDTO patientDTO) throws PatientAdmissionException
	{




		return null;
		
	}

}
