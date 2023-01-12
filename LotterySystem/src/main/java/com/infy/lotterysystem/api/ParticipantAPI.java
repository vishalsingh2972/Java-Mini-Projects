package com.infy.lotterysystem.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.infy.lotterysystem.dto.ParticipantDTO;
import com.infy.lotterysystem.exception.LotteryBookingException;
import com.infy.lotterysystem.service.ParticipantService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping(value = "/api")
@Validated
public class ParticipantAPI {

	@Autowired
	private ParticipantService participantService;

	@GetMapping(value = "/participant/{couponNumber}")
	public ResponseEntity<ParticipantDTO> getLotteryWinner(@PathVariable @Pattern(regexp = "[A-Z]{3}[0-9]{3}", message = "{lottery.couponnumber.invalid}") String couponNumber) throws LotteryBookingException
	{
		
		ParticipantDTO dto1 = participantService.getLotteryWinner(couponNumber);

		return new ResponseEntity<ParticipantDTO>(dto1, HttpStatus.OK);

		
	}


	@PostMapping(value = "/participants")
	public ResponseEntity<ParticipantDTO> addParticipant(@RequestBody @Valid ParticipantDTO participantDTO) throws LotteryBookingException
	{

		ParticipantDTO dto2 = participantService.addParticipant(participantDTO);

		return new ResponseEntity<ParticipantDTO>(dto2, HttpStatus.CREATED);
		
	}


}
