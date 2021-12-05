package com.example.aluguelcarros.controllers;

import com.example.aluguelcarros.entities.Garagem;
import com.example.aluguelcarros.entities.Veiculo;
import com.example.aluguelcarros.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping("")
    public ResponseEntity<List<Veiculo>> listarVeiculos() {
        List<Veiculo> listaDeVeiculos = service.findAll();
        return ResponseEntity.ok().body(listaDeVeiculos);
    }

    @GetMapping("/{idVeiculo}")
    public ResponseEntity<Veiculo> recuperarVeiculo(@PathVariable Integer idVeiculo) {
        Veiculo veiculo = service.findById(idVeiculo);
        return ResponseEntity.ok().body(veiculo);
    }
}
