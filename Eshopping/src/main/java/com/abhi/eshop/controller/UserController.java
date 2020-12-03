package com.abhi.eshop.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.eshop.entities.User;
import com.abhi.eshop.repos.UserRepository;


@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/user")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    
    @DeleteMapping("/user/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long userId){
        User user = userRepository.findById(userId);
    	userRepository.delete(user);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,@RequestBody User userDetails) {
        User user = userRepository.findById(userId);
        user.setLname(userDetails.getLname());
        user.setFname(userDetails.getFname());
        user.setEmail(userDetails.getEmail());
        user.setMob(userDetails.getMob());
        user.setAddress(userDetails.getAddress());
        user.setCity(userDetails.getCity());
        user.setState(userDetails.getState());
        user.setCountry(userDetails.getCountry());
        user.setZip(userDetails.getZip());
        final User updatedUser = userRepository.save(user);
        return ResponseEntity.ok(updatedUser);
    }


}