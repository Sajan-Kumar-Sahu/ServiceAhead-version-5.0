package com.alextechsolutions.serviceaheadversion5_0.service;

import com.alextechsolutions.serviceaheadversion5_0.model.Users;
import com.alextechsolutions.serviceaheadversion5_0.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Registration_Process {

    private final UserRepo repo;

    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Registration_Process(UserRepo repo) {
        this.repo = repo;
    }

    public void register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
    }
}
