package com.watherlloy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watherlloy.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
