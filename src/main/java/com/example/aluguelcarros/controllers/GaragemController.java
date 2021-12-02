package com.example.aluguelcarros.controllers;

import com.example.aluguelcarros.entities.Garagem;
import com.example.aluguelcarros.entities.Veiculo;
import com.example.aluguelcarros.services.GaragemService;
import com.example.aluguelcarros.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/garagens")
public class GaragemController {

    @Autowired
    private GaragemService service;

    @Autowired
    private VeiculoService vService;

    @GetMapping("")
    public ResponseEntity<List<Garagem>> listarGaragens() {
        List<Garagem> listaDeGaragens = service.findAll();
        return ResponseEntity.ok().body(listaDeGaragens);
    }

    @GetMapping("/{idGaragem}")
    public ResponseEntity<Garagem> recuperarGaragem(@PathVariable Integer idGaragem) {
        Garagem garagem = service.findById(idGaragem);
        return ResponseEntity.ok().body(garagem);
    }

    @GetMapping("/veiculos")
    public ResponseEntity<List<Veiculo>> listarVeiculosDaGaragem(@RequestParam Integer idGaragem) {
        List<Veiculo> listaDeVeiculos = vService.findByGaragem(idGaragem);
        return ResponseEntity.ok().body(listaDeVeiculos);
    }
}
