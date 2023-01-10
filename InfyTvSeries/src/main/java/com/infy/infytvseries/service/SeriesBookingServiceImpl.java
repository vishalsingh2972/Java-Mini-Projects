package com.infy.infytvseries.service;

import com.infy.infytvseries.dto.UserDTO;
import com.infy.infytvseries.entity.User;
import com.infy.infytvseries.exception.SeriesBookingException;
import com.infy.infytvseries.repository.UserRepository;
import com.infy.infytvseries.validator.UserValidator;

public class SeriesBookingServiceImpl implements SeriesBookingService{
	
	private UserRepository userRepository;

	@Override
	public UserDTO registerUser(UserDTO userDTO) throws SeriesBookingException {
		// TODO Auto-generated method stub
//		UserValidator.validateUser(userDTO);
//		Optional<User> optional= userRepository.findByEmailAndSeriesName (userDTO.getEmail(), userDTO.getSeriesName());
//		if (optional.isPresent())
//		{
//			throw new Series BookingException("Service.USER_ALREADY_PRESENT");
//		}
//		User user= new User();
//		user.setUserName(userDTO.getUserName());
//		user.setEmail(userDTO.getEmail());
//		user.setRegDate(userDTO.getRegDate());
//		user.setSeriesType(userDTO.getSeriesType());
//		user.setSeriesName(userDTO.getSeriesName());
//		user=userRepository.save(user);
//		userDTO.setRegistrationId(user.getRegistrationId());
//		return userDTO;
		return null;
	}

	@Override
	public UserDTO getDetailsByUserEmail(String email) throws SeriesBookingException {
		// TODO Auto-generated method stub
//		Optional <User> optional=userRepository.findByEmail(email);
//		//User user = optional.orElse Throw(()-> new Series BookingException("Service.NO_DETAILS FOUND"));
//		if (optional.isEmpty())
//		{
//			new SeriesBookingException("Service. NO_DETAILS FOUND");
//		}
//		User user=optional.get();
//		UserDTO userDTO= new UserDTO();
//		userDTO.setRegistrationId(user.getRegistrationId());
//		userDTO.setUserName(user.getUserName()); userDTO.setEmail (user.getEmail());
//		userDTO.setRegDate(user.getRegDate());
//		userDTO.setSeriesType(user.getSeriesType());
//		userDTO.setSeriesName(user.getSeriesName());
//		return userDTO;
		return null;
	}

}
