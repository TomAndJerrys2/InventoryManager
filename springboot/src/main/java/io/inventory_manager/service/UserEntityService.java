package io.inventory_manager.service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import io.inventory_manager.SpringAPI.model.UserEntity;
import io.inventory_manager.service.JTester;

public class UserEntityService {

    private List<UserEntity> userEntityList;
    private JTester testHook;

    public UserEntityService() {
        userEntityList = new ArrayList<>();

        testHook.generateEntity();
    }

    public Optional<UserEntity> getUserEntity(Long entityID) {
        Optional opt = Optional.empty();
        for (UserEntity entity : userEntityList) {
            if (entityID == entity.getId()) {
                opt = Optional.of(entity);
                return opt;
            }
        }
        // if no hit
        return opt;
    }
}
