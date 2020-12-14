//package com.abhi.eshop.service;
//
//import java.util.regex.Pattern;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.abhi.eshop.entities.User;
//import com.abhi.eshop.repos.UserRepository;
//
//@Service
//@Transactional
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public User validateUser(String email, String password){
//        if(email != null) email = email.toLowerCase();
//        return userRepository.findByEmailAndPassword(email, password);
//    }
//
//    @Override
//    public User registerUser(String firstName, String lastName, String email, String password) {
//        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
//        if(email != null) email = email.toLowerCase();
//        if(!pattern.matcher(email).matches())
//            System.out.println("Invalid email format");
//        Integer count = userRepository.getCountByEmail(email);
//        if(count > 0)
//            System.out.println("Email already in use");
//        User user = userRepository.create(firstName, lastName, email, password);
//        return user;
//    }
//}
