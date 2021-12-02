package com.example.aluguelcarros.services;

import com.example.aluguelcarros.entities.Veiculo;
import com.example.aluguelcarros.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> findAll() {
        return repository.findAll();
    }

    public List<Veiculo> findByGaragem(Integer idGaragem) {
        return repository.findByIdGaragem(idGaragem);
    }
}
