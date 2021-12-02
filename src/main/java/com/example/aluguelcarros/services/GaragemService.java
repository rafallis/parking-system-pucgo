package com.example.aluguelcarros.services;

import com.example.aluguelcarros.entities.Garagem;
import com.example.aluguelcarros.repositories.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GaragemService {

    @Autowired
    private GaragemRepository repository;

    public List<Garagem> findAll() {
        return repository.findAll();
    }

    public Garagem findById(Integer id) {
        Optional<Garagem> obj = repository.findById(id);
        return obj.get();
    }
}
