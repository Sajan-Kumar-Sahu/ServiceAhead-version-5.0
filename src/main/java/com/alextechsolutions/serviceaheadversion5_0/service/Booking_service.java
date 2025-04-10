package com.alextechsolutions.serviceaheadversion5_0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alextechsolutions.serviceaheadversion5_0.model.BookingDetail;
import com.alextechsolutions.serviceaheadversion5_0.repository.Booking_repo;

@Service
public class Booking_service {
    
    @Autowired
    Booking_repo repo;

    @Autowired
    SimpleEmailService simpleEmailService;

    public void add(BookingDetail bDetail){
        repo.save(bDetail);
        simpleEmailService.sendEmail(bDetail);
    }
}
