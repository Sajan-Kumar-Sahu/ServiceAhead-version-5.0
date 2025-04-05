package com.alextechsolutions.serviceaheadversion5_0.repository;

import com.alextechsolutions.serviceaheadversion5_0.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    public Users findByUsername(String username);
}
