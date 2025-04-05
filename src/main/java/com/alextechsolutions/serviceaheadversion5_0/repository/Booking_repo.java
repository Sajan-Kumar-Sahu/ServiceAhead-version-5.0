package com.alextechsolutions.serviceaheadversion5_0.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alextechsolutions.serviceaheadversion5_0.model.BookingDetail;

@Repository
public interface Booking_repo extends JpaRepository<BookingDetail,Long>{


}
