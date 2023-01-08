package com.infy.hospitalmanagement.repository;

import com.infy.hospitalmanagement.entity.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Integer >{


    //List<Patient>findBydiagnosis(String diagnosis);

}
