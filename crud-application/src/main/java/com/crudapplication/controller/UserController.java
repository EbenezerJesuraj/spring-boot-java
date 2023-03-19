package com.crudapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

import lombok.AllArgsConstructor;
import com.crudapplication.entity.User;
import com.crudapplication.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/* 
@RestController  
public class CrudApplicationController { 
@RequestMapping("/")  
public String hello()   
    {  
        return "Hello User";  
    }
*/



@AllArgsConstructor

@RestController 
@RequestMapping("/start")
public class UserController {

    private UserService userService;
    
      
    // build create User REST API
    //@RequestMapping("/post")
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        System.out.println("Inside of PostMapping");
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // build get user by id REST API
    // http://localhost:8080/api/users/1
    //@RequestMapping("/getid")
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user = userService.getUserById(userId);
        System.out.println("Inside of Get-id Mapping");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    //@RequestMapping("/get")
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        System.out.println("Inside of GetMapping");
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Build Update User REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody User user){
        
        user.setId(userId);
        System.out.println("Inside of updateMapping");
        User updatedUser = userService.updateUser(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        System.out.println("Inside of deleteMapping");
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }
}
