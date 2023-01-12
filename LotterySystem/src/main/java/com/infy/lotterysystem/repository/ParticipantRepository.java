package com.infy.lotterysystem.repository;

import com.infy.lotterysystem.entity.Participant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParticipantRepository extends CrudRepository<Participant, Integer> {

    Participant findByCouponNumber (String couponNumber);

}
