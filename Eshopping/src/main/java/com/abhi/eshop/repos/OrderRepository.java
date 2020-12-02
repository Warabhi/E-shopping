package com.abhi.eshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.eshop.entities.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, String>{

	Order findById(Long orderId);

}
