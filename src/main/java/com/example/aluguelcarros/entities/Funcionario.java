package com.example.aluguelcarros.entities;

import javax.persistence.*;

@Entity
@Table(name = "Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula")
    private Integer matricula;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "FK_id_empresa", nullable = false)
    private Empresa empresa;
}
