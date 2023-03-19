package com.crudapplication.service.Impl;

import lombok.AllArgsConstructor;
import com.crudapplication.entity.User;
import com.crudapplication.repository.CrawlerDataRepository;
import com.crudapplication.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CrawlerDataServiceImpl implements UserService {

    private CrawlerDataRepository CrawlerDataRepository;

    @Override
    public User createUser(User user) {
        System.out.println("Inside of creates user");
        return CrawlerDataRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        System.out.println("Inside of get user by ID");
        Optional<User> optionalUser = CrawlerDataRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return CrawlerDataRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = CrawlerDataRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser = CrawlerDataRepository.save(existingUser);
        return updatedUser;
    }

    @Override
    public void deleteUser(Long userId) {
        CrawlerDataRepository.deleteById(userId);
    }

    @Override
    public User setId(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
