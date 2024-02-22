package com.watherlloy.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watherlloy.course.entities.Order;
import com.watherlloy.course.entities.User;
import com.watherlloy.course.repositories.OrderRepository;
import com.watherlloy.course.repositories.UserRepository;

@Service
public class OrderService {

	
	// Buscar todos os users
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public List<Order> findAllUsers() {
		return orderRepository.findAll();
	}
	
	//Buscar user pelo id
	
	public Order findUserById (Long id) {
		Optional<Order> objUser =  orderRepository.findById(id);
		return objUser.get();
	}
}
