package com.example.aluguelcarros.repositories;

import com.example.aluguelcarros.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
