package com.infy.moviebooking.service;

import java.util.List;

import com.infy.moviebooking.dto.MovieBookingDTO;

public interface MovieBookingService {
	Double calculateBookingAmount(Integer noOfSeats, String screenName);
	MovieBookingDTO bookMovie(MovieBookingDTO movieBookingDTO);
	List<MovieBookingDTO>getBookingByScreenName(String screenName);

}
