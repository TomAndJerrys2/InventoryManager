package io.Exceptions;

public class InvalidPasswordFormatException extends Exception {
    // code here for password length, character type and symbol handling

    // Default Constructor
    public InvalidPasswordFormatException() {
        super(); // calling super for now to avoid runtime errors
    }
}
