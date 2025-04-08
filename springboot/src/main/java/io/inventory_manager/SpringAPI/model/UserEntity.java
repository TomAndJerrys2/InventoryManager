package io.inventory_manager.SpringAPI.model;

import java.sql.Date;
// Libraries
import java.util.Objects;

import io.Exceptions.InvalidPasswordFormatException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// Class for defining User/Account Properties for login/sign etc.

@Entity // Ready to store via JPA
public class UserEntity {
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

    private @Id @GeneratedValue Long _id;

    // Default Constructor
    public UserEntity() {
        System.out.println("[+] Constructed Empty User Entity");
    }

    UserEntity(String fname, String lname, String email,
            String uName, String pWord) {
        this.firstName = fname;
        this.lastName = lname;
        this.email = email;
        this.userName = uName;
        this.passWord = pWord; // refactor later
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

    public Long getId() {
        return this._id;
    }

    // Setters
    private final void setId() {
        // Some algorithm for creating a psuedo-random ID (Long)
    }

    protected void setUsername(String uName) {
        this.userName = uName;
    }

    // Refactor later to make safer
    // Add Encryption adn Flags
    protected void setPassword(String pWord) {
        if (pWord == null) {
            // throw new InvalidPasswordFormatException();
        }

        this.passWord = pWord;
    }

    // Class Methods
}