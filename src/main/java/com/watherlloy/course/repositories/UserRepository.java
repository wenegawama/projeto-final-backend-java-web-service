package com.watherlloy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watherlloy.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
