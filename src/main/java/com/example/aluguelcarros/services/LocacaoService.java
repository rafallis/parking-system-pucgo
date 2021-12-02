package com.example.aluguelcarros.services;

import com.example.aluguelcarros.entities.ContratoLocacao;
import com.example.aluguelcarros.repositories.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocacaoService {

    @Autowired
    private LocacaoRepository repository;

    public List<ContratoLocacao> findAll() {
        return repository.findAll();
    }

    public ContratoLocacao findById(Integer id) {
        Optional<ContratoLocacao> obj = repository.findById(id);
        return obj.get();
    }

    public List<ContratoLocacao> findAllActive() {
        List<ContratoLocacao> listaContratosAtivos = repository.findByAtivoTrue();
        return listaContratosAtivos;
    }

    public ContratoLocacao novaLocacao(ContratoLocacao contrato) {
        ContratoLocacao novoContrato = contrato;
        return repository.save(contrato);
    }
}
