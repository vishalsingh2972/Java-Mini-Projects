package com.infy.moviebooking.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.infy.moviebooking.dto.MovieBookingDTO;
import com.infy.moviebooking.exception.MovieBookingException;
import com.infy.moviebooking.service.MovieBookingService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@Validated
public class MovieBookingAPI {

	@Autowired
	private MovieBookingService movieBookingService;

	@PostMapping(value = "/movie")
	public ResponseEntity<MovieBookingDTO> bookMovie(MovieBookingDTO movieBookingDTO) throws MovieBookingException
	{

		MovieBookingDTO dto1 = movieBookingService.bookMovie(movieBookingDTO);

		return new ResponseEntity<>(dto1, HttpStatus.CREATED);
		
	}

	@GetMapping(value = "movie/{screenName}")
	public ResponseEntity<List<MovieBookingDTO>>getBookingByScreenName(@PathVariable String screenName) throws MovieBookingException
	{

		List<MovieBookingDTO> dto2 = movieBookingService.getBookingByScreenName(screenName);

		return new ResponseEntity<>(dto2, HttpStatus.OK);
		
	}

}
