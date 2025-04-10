package com.alextechsolutions.serviceaheadversion5_0.controller;

import com.alextechsolutions.serviceaheadversion5_0.model.BookingDetail;
import com.alextechsolutions.serviceaheadversion5_0.model.Users;
import com.alextechsolutions.serviceaheadversion5_0.service.Booking_service;
import com.alextechsolutions.serviceaheadversion5_0.service.Registration_Process;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    Booking_service service;

    @GetMapping("/")
    public String homePage(){
        return "redirect:/html/home.html";
    }

    @Autowired
    private Registration_Process register;
    @PostMapping("/register_process")
    public String registration(@ModelAttribute Users user){
        System.out.println(user);
        register.register(user);
        return "redirect:/html/login.html";
    }
    @PostMapping("/confirmbook")
    public String bookingconfirm(@ModelAttribute BookingDetail bookingdetail) {
        System.out.println("Entered the process");
        service.add(bookingdetail);
        return "redirect:/html/home.html";
    }

}
