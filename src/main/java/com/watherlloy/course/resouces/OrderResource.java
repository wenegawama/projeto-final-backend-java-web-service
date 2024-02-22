package com.watherlloy.course.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watherlloy.course.entities.Order;
import com.watherlloy.course.repositories.OrderRepository;
import com.watherlloy.course.services.OrderService;

@RestController
@RequestMapping(value ="/orders") // aqui é o path
public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private OrderRepository orderRepository;
	
	//Buscar todos os orders
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> listOrder = orderService.findAllUsers();
			
		return ResponseEntity.ok().body(listOrder);
	}
	
	//Buscar user pelo id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findOrderById (@PathVariable Long id) {
		Order obj = orderService.findUserById(id);
		return ResponseEntity.ok().body(obj);
	}

}
