package com.example.aluguelcarros.repositories;

import com.example.aluguelcarros.entities.ContratoLocacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocacaoRepository extends JpaRepository<ContratoLocacao, Integer> {

    List<ContratoLocacao> findByAtivoTrue();
}
