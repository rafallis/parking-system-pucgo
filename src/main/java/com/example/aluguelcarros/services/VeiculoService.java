package com.example.aluguelcarros.services;

import com.example.aluguelcarros.entities.ContratoLocacao;
import com.example.aluguelcarros.entities.Veiculo;
import com.example.aluguelcarros.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> findAll() {
        return repository.findAll();
    }

    public Veiculo findById(Integer idVeiculo) {
        Optional<Veiculo> obj = repository.findById(idVeiculo);
        return obj.get();
    }

    public List<Veiculo> findByGaragem(Integer idGaragem) {
        return repository.findByIdGaragem(idGaragem);
    }
}
