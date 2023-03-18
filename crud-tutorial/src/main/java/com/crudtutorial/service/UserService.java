package com.crudtutorial.service;

import java.util.List;

public interface UserService<User> {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    User setId(Long userId);

    void deleteUser(Long userId);
}