package io.inventory_manager;

import java.sql.Date;
// Libraries
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Class for defining User/Account Properties for login/sign etc.

@Entity // Ready to store via JPA
class UserEntity {
    // Basic User Information
    private String firstName;
    private String lastName;
    private String email;
    // Account Information
    protected Boolean isAdmin;
    private String userName;
    private String passWord;
    // Meta-data
    public Date accountCreation = null; // default

    private @Id 
    @GeneratedValue Long _id;

    // Default Constructor
    UserEntity() {
        System.out.println("[+] Constructed Empty User Entity");
    }

    UserEntity(String fname, String lname, String email,
            String uName, String pWord) {
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
        this.userName = uName;
        this.passWord = setPassword();
    }

    // Getters
    public String getFname() {
        return this.firstName;
    }

    public String getLname() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    // Setters
    private final void setId() {
        
    }

    protected void setUsername(String uName) {
        this.userName = uName;
    }

    protected void setPassword(String pWord) {
        this.passWord = pWord;
    }

    // Class Methods
    protected 
}