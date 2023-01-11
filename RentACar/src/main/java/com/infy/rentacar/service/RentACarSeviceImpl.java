package com.infy.rentacar.service;

import java.util.List;

import com.infy.rentacar.dto.RentalDTO;
import com.infy.rentacar.exception.RentACarException;
import com.infy.rentacar.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "rentACarService")
@Transactional
public class RentACarSeviceImpl implements RentACarSevice{

	@Autowired
	private RentalRepository  rentalRepository;
	@Override
	public RentalDTO rentACar(RentalDTO rentalDTO) throws RentACarException {
		// TODO Auto-generated method stub
//		Validator.validate(rentalDTO);
//  // Without using prepareEntity method
//		Rental rental=new Rental();
//		rental.setCarType (rentalDTO.getCarType());
//		rental.setBookingStartDate(rentalDTO.getBookingStartDate());
//		rental.setDuration(rentalDTO.getDuration());
//		rental.setCustomerName (rentalDTO.getCustomerName());
//		rental.setMobile Number (rentalDTO.getMobile Number());
//  //with using prepareEntity method
//  //Rental rental= RentalDTO.prepare Entity (rentalDTO);
//		rental= rentalRepository.save(rental);
//		rentalDTO.setRentalId(rental.getRentalId());
//		return rentalDTO;
		return null;
	}

	@Override
	public List<RentalDTO> getRentalByCarType(String carType) throws RentACarException {
		// TODO Auto-generated method stub
//		List<Rental> rentals= rentalRepository.findByCarType (carType);
//		if(rentals.isEmpty())
//		{
//			throw new RentACarException("Service.NO_RENTALS_FOUND");
//		} List<RentalDTO> rentalDTOs=new ArrayList<RentalDTO>();
//		for (Rental rental: rentals)
//		{
//    // Without using prepareDTO method
//			RentalDTO rentalDTO-new RentalDTO();
//			rentalDTO.setRentalId(rental.getRentalId());
//			rentalDTO.setCarType (rental.getCarType());
//			rentalDTO.setBookingStartDate(rental.getBookingStartDate());
//			rentalDTO.setDuration(rental.getDuration());
//			rentalDTO.setCustomerName (rental.getCustomerName());
//			rentalDTO.setMobile Number (rental.getMobile Number());
//    // with using prepareEntity method
//    // RentalDTO rentalDTO= RentalDTO. prepareDTO (rental);
//			rentalDTOS.add(rentalDTO);
//		}
//		return rentalDTOS;
		return null;
	}

}
