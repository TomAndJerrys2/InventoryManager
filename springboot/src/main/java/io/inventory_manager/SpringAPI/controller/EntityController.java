package io.inventory_manager.SpringAPI.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.inventory_manager.SpringAPI.model.UserEntity; // Defined for properties
import io.inventory_manager.service.UserEntityService; // handling requests / data store's

// <-- REST API SERVICE --> 

@RestController
public class EntityController {

    private UserEntityService entityService;

    // default constructor
    @Autowired
    public EntityController(UserEntityService eService) {
        this.entityService = eService;
    }

    // Mapping requests to handle entity information
    @GetMapping
    public UserEntity getUserEntity(@RequestParam Long entityID) {
        Optional activeUser = entityService.getUserEntity(entityID);
        // inefficient but works for now
        if (activeUser.isPresent()) {
            return (UserEntity) activeUser.get();
        }
        return null;
    }
}
