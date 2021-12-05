package com.example.aluguelcarros.controllers;

import com.example.aluguelcarros.entities.ContratoLocacao;
import com.example.aluguelcarros.services.LocacaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/contratos")
public class ContratoController {

    private Logger logger = LoggerFactory.getLogger(ContratoController.class);

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
    public ResponseEntity<Object> criar(@RequestBody ContratoLocacao contrato) {
        try {
            service.novaLocacao(contrato);
            return new ResponseEntity<>(contrato, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return new ResponseEntity<>(contrato, HttpStatus.BAD_REQUEST);
    }
}
