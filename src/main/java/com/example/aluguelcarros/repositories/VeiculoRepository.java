package com.example.aluguelcarros.repositories;

import com.example.aluguelcarros.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    @Query("select v from Veiculo v left join Garagem g on v.garagem.idGaragem = g.idGaragem where v.garagem.idGaragem = ?1")
    List<Veiculo> findByIdGaragem(Integer idGaragem);
}
