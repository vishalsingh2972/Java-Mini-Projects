package com.infy.lotterysystem.service;

import com.infy.lotterysystem.dto.ParticipantDTO;
import com.infy.lotterysystem.exception.LotteryBookingException;

public interface ParticipantService {
ParticipantDTO addParticipant(ParticipantDTO participantDTO) throws LotteryBookingException;
ParticipantDTO getLotteryWinner(String couponNumber) throws LotteryBookingException;
}
