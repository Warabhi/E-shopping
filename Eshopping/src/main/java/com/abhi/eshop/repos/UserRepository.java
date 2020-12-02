package com.abhi.eshop.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.eshop.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findById(Long userId);

}
