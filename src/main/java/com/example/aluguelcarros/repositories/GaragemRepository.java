package com.example.aluguelcarros.repositories;

import com.example.aluguelcarros.entities.Garagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GaragemRepository extends JpaRepository<Garagem, Integer> {
}
