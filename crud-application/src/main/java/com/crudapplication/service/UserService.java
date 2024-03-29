package com.crudapplication.service;

import com.crudapplication.entity.User;
  
import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    User setId(Long userId);

    void deleteUser(Long userId);
}
