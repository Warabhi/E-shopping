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

import com.abhi.eshop.entities.Order;
import com.abhi.eshop.repos.OrderRepository;

@RestController
public class OrderController {
	@Autowired OrderRepository orderRepository; 
	
    @GetMapping("/order")
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }
    
    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
    
    @DeleteMapping("/order/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long orderId){
    	Order order = orderRepository.findById(orderId);
        orderRepository.delete(order);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    @PutMapping("/order/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable(value = "id") Long orderId,@RequestBody Order orderDetails) {
    	Order order = orderRepository.findById(orderId);
    	order.setOrdercategory(orderDetails.getOrdercategory());
    	order.setDeliveryboy(orderDetails.getDeliveryboy());
    	order.setAmount(orderDetails.getAmount());
    	order.setDiscount(orderDetails.getDiscount());
    	order.setDate(orderDetails.getDate());
        final Order updatedOrder = orderRepository.save(order);
        return ResponseEntity.ok(updatedOrder);
    }


}
