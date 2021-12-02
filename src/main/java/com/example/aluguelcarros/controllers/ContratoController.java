package com.example.aluguelcarros.controllers;

import com.example.aluguelcarros.entities.ContratoLocacao;
import com.example.aluguelcarros.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contratos")
public class ContratoController {

    @Autowired
    private LocacaoService service;

    @GetMapping("")
    public ResponseEntity<List<ContratoLocacao>> listarTodosContratos() {
        List<ContratoLocacao> listaDeContratos = service.findAll();
        return ResponseEntity.ok().body(listaDeContratos);
    }

    @GetMapping("/{idContrato}")
    public ResponseEntity<ContratoLocacao> buscarContrato(@PathVariable Integer idContrato) {
        ContratoLocacao contrato = service.findById(idContrato);
        return ResponseEntity.ok().body(contrato);
    }

    @GetMapping("/listar/ativos")
    public ResponseEntity<List<ContratoLocacao>> listarContratosAtivos() {
        List<ContratoLocacao> listaDeContratosAtivos = service.findAllActive();
        return ResponseEntity.ok().body(listaDeContratosAtivos);
    }

    @PostMapping("/novo")
    public ResponseEntity<ContratoLocacao> criar(ContratoLocacao contrato) {
        return new ResponseEntity<>(service.novaLocacao(contrato), HttpStatus.CREATED);
    }
}
