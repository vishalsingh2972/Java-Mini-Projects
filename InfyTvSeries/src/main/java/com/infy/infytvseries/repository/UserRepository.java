package com.infy.infytvseries.repository;

import com.infy.infytvseries.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmailandSeriesName(String email, String seriesName);
//    List<User> findByEmailandSeriesName(String email, String seriesName);


    Optional<User> findByEmail(String email);
//    List<User> findByEmail(String email);

}
