package com.alextechsolutions.serviceaheadversion5_0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.ToString;



@Entity
@ToString
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;

        public String getPassword() {
            return password;
        }

        // Setter for password
        public void setPassword(String password) {
            this.password = password;
        }

        // Getter for username
        public String getUsername() {
            return username;
        }

        // Setter for username
        public void setUsername(String username) {
            this.username = username;
        }

        // Other fields and methods...

}