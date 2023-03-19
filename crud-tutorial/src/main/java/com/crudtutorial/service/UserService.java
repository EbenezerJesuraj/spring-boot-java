package com.crudtutorial.service;

import com.crudtutorial.entity.User;
  
import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    User setId(Long userId);

    void deleteUser(Long userId);
}
