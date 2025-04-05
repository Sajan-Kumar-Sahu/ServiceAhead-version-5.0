package com.alextechsolutions.serviceaheadversion5_0.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@ToString
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
<<<<<<< HEAD:src/main/java/com/alextechsolutions/serviceaheadversion5_0/Model/Users.java

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
=======
}
>>>>>>> 8e7fc9536f3da59a5ce71c69df4ce13e9ac02e74:src/main/java/com/alextechsolutions/serviceaheadversion5_0/model/Users.java
