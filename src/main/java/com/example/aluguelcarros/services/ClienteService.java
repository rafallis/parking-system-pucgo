package com.example.aluguelcarros.services;

import com.example.aluguelcarros.entities.Cliente;
import com.example.aluguelcarros.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Cliente findById(Integer id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.get();
    }

    public Cliente addNewClient(Cliente novoCliente) {
        Cliente novo = repository.save(novoCliente);
        return novo;
    }
}
