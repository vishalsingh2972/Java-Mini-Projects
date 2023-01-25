package com.infy.moviebooking.repository;

import com.infy.moviebooking.entity.MovieBooking;
import org.apache.tomcat.jni.Local;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovieBookingRepository extends CrudRepository<MovieBooking, Integer> {
   @Query("SELECT m FROM MovieBooking m WHERE customerPhoneNo=:customerPhoneNo AND showDate=:showDate")
   List<MovieBooking> getBookingsDetails(Long customerPhoneNo, LocalDate showDate);
   List<MovieBooking> findByScreenName(String screenName);

}
