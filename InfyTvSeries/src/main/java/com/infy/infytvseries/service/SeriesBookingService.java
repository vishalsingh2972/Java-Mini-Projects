package com.infy.infytvseries.service;

import com.infy.infytvseries.dto.UserDTO;
import com.infy.infytvseries.exception.SeriesBookingException;

public interface SeriesBookingService {

	public UserDTO registerUser(UserDTO userDTO) throws SeriesBookingException;
	public UserDTO getDetailsByUserEmail(String email) throws SeriesBookingException;

}
