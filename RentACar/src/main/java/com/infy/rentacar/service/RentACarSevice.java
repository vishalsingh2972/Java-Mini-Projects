package com.infy.rentacar.service;

import java.util.List;

import com.infy.rentacar.dto.RentalDTO;
import com.infy.rentacar.exception.RentACarException;

public interface RentACarSevice {

	RentalDTO rentACar(RentalDTO rentalDTO) throws RentACarException;
	List<RentalDTO> getRentalByCarType(String carType) throws RentACarException;
}
