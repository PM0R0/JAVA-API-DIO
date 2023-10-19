package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cliente;

@Repository //Componente do Spring
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	//Implementação fornecida pelo Spring JPA em tempo de execução
}
