package com.infy.lotterysystem.service;

import com.infy.lotterysystem.dto.ParticipantDTO;
import com.infy.lotterysystem.exception.LotteryBookingException;
import com.infy.lotterysystem.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "participantService")
@Transactional
public class ParticipantSeviceImpl  implements ParticipantService{

	@Autowired
	private ParticipantRepository participantRepository;
	@Override
	public ParticipantDTO addParticipant(ParticipantDTO participantDTO) throws LotteryBookingException {
		// TODO Auto-generated method stub

//		ParticipantValidator.validateParticipant(participantDTO);
//		Participant participant = ParticipantDTO.prepareEntity(participantDTO);
//		//--------incase they didn't provide prepareEntity methods
//		Participant participant = new Participant();
//	    participant.setName(participantDTO.getName());
//		participant.setAge(participantDTO.getAge());
//		participant.setMailId(participantDTO.getMailId());
//		participant.setContactNo(participantDTO.getContactNo());
//		participant.setCouponNumber(participantDTO.getCouponNumber());
//		participant.setWinningAmount(participantDTO.getWinningAmount());
//		participant = participantRepository.save(participant);
//		participantDTO.setParticipantId (participant.getParticipantId());
//		return participantDTO;

		return null;
	}

	@Override
	public ParticipantDTO getLotteryWinner(String couponNumber) throws LotteryBookingException {
		// TODO Auto-generated method stub

//		Participant participant = participantRepository.findByCouponNumber(couponNumber);
//		if(participant==null)
//		{
//			throw new LotteryBookingException("ParticipantService.NO_PARTICIPANT_AVAILABLE");
//		}
//		ParticipantDTO participantDTO = ParticipantDTO.prepareDTO(participant);
////-----incase they didn't provide prepareDTO method
//// ParticipantDTO participantDTO= new ParticipantDTO();
//// participantDTO.setParticipantId(participant.getParticipantId());
//// participantDTO.setName(participant.getName());
//// participantDTO.setAge(participant.getAge());
//// participantDTO.setMailId(participant.getMailId());
//// participantDTO.setContactNo(participant.getContactNo());
//// participantDTO.setCouponNumber(participant.getCoupon Number());
//// participantDTO.setWinningAmount(participant.getWinningAmount());
//		return participantDTO;

		return null;
	}

}
