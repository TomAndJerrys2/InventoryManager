package io.inventory_manager.service;

import org.springframework.security.core.userdetails.User;

import io.inventory_manager.SpringAPI.model.UserEntity;

// JTester class used for CRUD and testing operations

// will come back when test cases are of better use 
public class JTester {

    // <-- CRUD Operations -->
    public UserEntity generateEntity() {
        UserEntity JEntity = new UserEntity(); // Empty Entity Container
        return JEntity;
    }

    public UserEntity modifyEntity(UserEntity entity) {
        return entity; // boilerplate
    }

    public void removeEntity(UserEntity entity) {
        if (entity == null) {
            System.out.println("[!] Named Entity does not exist.");
        }
    }

    // <-- Testing Operations -->
}
