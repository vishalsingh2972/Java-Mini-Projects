package com.infy.rentacar.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.infy.rentacar.dto.RentalDTO;
import com.infy.rentacar.exception.RentACarException;
import com.infy.rentacar.service.RentACarSevice;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping(value = "/rentacar")
@Validated
public class RentACarAPI {

	@Autowired
	private RentACarSevice rentACarSevice;

	@PostMapping(value = "/rent")
	public ResponseEntity<RentalDTO>rentACar(@RequestBody @Valid RentalDTO rentalDTO) throws RentACarException
	{

		RentalDTO dto = rentACarSevice.rentACar(rentalDTO);

		return new ResponseEntity<>(dto, HttpStatus.CREATED);
		
	}

	@GetMapping(value = "/customers/{carType}")
	public ResponseEntity<List<RentalDTO>>getRentals(@PathVariable @Valid @Pattern(regexp = "(Automatic | Electric | Manual)", message = "{rental.cartype.invalid}") String carType) throws RentACarException
	{

		List<RentalDTO> dto2 = rentACarSevice.getRentalByCarType(carType);

		return new ResponseEntity<>(dto2,HttpStatus.OK);

	}
}
