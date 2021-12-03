package com.example.aluguelcarros.controllers;

import com.example.aluguelcarros.entities.Cliente;
import com.example.aluguelcarros.services.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/clientes")
public class ClienteController {

    private Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @Autowired
    private ClienteService service;

    @GetMapping("")
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = service.findAll();
        return ResponseEntity.ok().body(clientes);
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable Integer idCliente) {
        Cliente cliente = service.findById(idCliente);
        return ResponseEntity.ok().body(cliente);
    }

    @PostMapping("/novo")
    public ResponseEntity<Object> novoCliente(@RequestBody Cliente cliente) {
        try {
            Cliente novoCliente = service.addNewClient(cliente);
            return new ResponseEntity<Object>(novoCliente, HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }
}
