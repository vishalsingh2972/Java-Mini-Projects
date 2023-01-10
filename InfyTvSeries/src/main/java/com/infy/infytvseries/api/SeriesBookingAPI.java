package com.infy.infytvseries.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.infy.infytvseries.dto.UserDTO;
import com.infy.infytvseries.exception.SeriesBookingException;
import com.infy.infytvseries.service.SeriesBookingService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping(value ="/api")
@Validated
public class SeriesBookingAPI {

	@Autowired
	private SeriesBookingService seriesBookingService;

	@PostMapping(value="/user")
	public ResponseEntity<UserDTO> registerUser(@RequestBody @Valid UserDTO userDTO) throws SeriesBookingException
	{
		UserDTO dto = seriesBookingService.registerUser(userDTO);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
		
	}

	@GetMapping(value="/user/{email}")
	public ResponseEntity<UserDTO>getDetailsByUserEmail(@PathVariable @Valid @Pattern(regexp = "[A-Za-z]+[0-9]+[@](gmail|infy)[.](com)", message = "{user.email.invalid}") String email) throws SeriesBookingException
	{
          UserDTO dto2 = seriesBookingService.getDetailsByUserEmail(email);
		  return new ResponseEntity<>(dto2, HttpStatus.OK);
		
	}
}
