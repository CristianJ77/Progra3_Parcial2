package com.example.demo.resposities;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Pago;

public interface PagoRepository extends CrudRepository<Pago, Long> {
	
}
