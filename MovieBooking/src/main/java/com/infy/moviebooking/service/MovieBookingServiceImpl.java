package com.infy.moviebooking.service;

import java.util.List;

import com.infy.moviebooking.dto.MovieBookingDTO;
import com.infy.moviebooking.repository.MovieBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "movieBookingService")
@Transactional
public class MovieBookingServiceImpl implements MovieBookingService{

	@Autowired
	private MovieBookingRepository movieBookingRepository;

	@Override
	public MovieBookingDTO bookMovie(MovieBookingDTO movieBookingDTO) {
		// TODO Auto-generated method stub
//		MovieBookingValidator.validate(movieBookingDTO);
//		List<MovieBooking> movieBookingList = movieBookingRepository.getBookingDetails
//				(movieBookingDTO.getCustomerPhoneNo(), movieBookingDTO.getShowDate());
//		if (Boolean.FALSE.equals(movieBookingList.isEmpty())) {
//			throw new MovieBookingException("MovieBookingService.BOOKING_EXISTS");
//		}
//		MovieBooking movieBooking = MovieBookingDTO.prepareEntity(movieBookingDTO);
//		movieBooking.setBookingAmount(calculateBookingAmount(movieBooking.getNoOfSeats(),
//				movieBooking.getScreenName()));
//		Integer movieID = movieBookingRepository.save(movieBooking).getBookingId();
//		movieBookingDTO.setBookingId(movieID);
//       return MovieBookingDTO.prepareDTO(movieBooking);
		return null;
	}

	@Override
	public Double calculateBookingAmount(Integer noOfSeats, String screenName) {
		// TODO Auto-generated method stub
//		Double bookingAmount=0.0;
//		if(screenName.equals("Rhombus"))
//		{
//			bookingAmount = 100.0 * noOfSeats;
//		}
//		else if(screenName.equals("Sapphire"))
//		{
//			bookingAmount = 200.0 * noOfSeats;
//		}
//			else
//		{            //for (screenName.equals("Turquoise")) case
//			bookingAmount = 300.0 * noOfSeats;
//		}
//		return bookingAmount;
		return null;
	}


	@Override
	public List<MovieBookingDTO> getBookingByScreenName(String screenName) {
		// TODO Auto-generated method stub
//		List<MovieBooking> movieBookingList=movieBookingRepository.findByScreenName(screenName);
//		if (movieBookingList.isEmpty()) {
//			throw new MovieBookingException("MovieBookingService.NO_BOOKING");
//		}
//		List<MovieBookingDTO>dtoList=new ArrayList<>();
//		movieBookingList.stream().forEach(x->dtoList.add(new MovieBookingDTO().prepareDTO(x)));
//		return dtoList;
		return null;
	}

}
