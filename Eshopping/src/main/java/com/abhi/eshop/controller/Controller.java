//package com.abhi.eshop.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.abhi.eshop.entities.User;
////import com.abhi.eshop.repos.UserRepository;
//
//
//
//@RestController
//public class Controller {
//	   private static Map<String, User> userRepository = new HashMap<>();
//	   
//	   static {
//		   User obj = new User();
//		      obj.setId("1");
//		      obj.setFname("Abhishek");
//		      userRepository.put(obj.getId(), obj);
//		   }
//	   
//	   @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
//	   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
//		   userRepository.remove(id);
//	      return new ResponseEntity<>("User is deleted successsfully", HttpStatus.OK);
//	   }
//	   
//	   @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
//	   public ResponseEntity<Object> updateUser(@PathVariable("id") String id, @RequestBody User user) { 
//		   userRepository.remove(id);
//		   user.setId(id);
//		   userRepository.put(id, user);
//	      return new ResponseEntity<>("User is updated successsfully", HttpStatus.OK);
//	   }
//	   
//	   @RequestMapping(value = "/users", method = RequestMethod.POST)
//	   public ResponseEntity<Object> createUser(@RequestBody User user) {
//		   userRepository.put(user.getId(), user);
//	      return new ResponseEntity<>("User is created successfully", HttpStatus.CREATED);
//	   }
//	   
//	   @RequestMapping(value = "/users")
//	   public ResponseEntity<Object> getUser() {
//		   
//	      return new ResponseEntity<>(userRepository.values(), HttpStatus.OK);
//	   }
//
//}
	
