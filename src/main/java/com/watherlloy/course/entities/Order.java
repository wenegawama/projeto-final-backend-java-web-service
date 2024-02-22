package com.watherlloy.course.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order" )
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "client_id") //nome da chave estrageira no bd
	private User client; //associação

	public Order() {
	
	}

	public Order(Long id, Instant moment, User client) {
		super();
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
	
	
} 
