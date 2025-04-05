package com.alextechsolutions.serviceaheadversion5_0.service;

import com.alextechsolutions.serviceaheadversion5_0.model.Users;
import com.alextechsolutions.serviceaheadversion5_0.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Registration_Process {


    private final UserRepo repo;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public void register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
    }
}
