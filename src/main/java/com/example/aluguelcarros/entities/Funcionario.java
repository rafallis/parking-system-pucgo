package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Funcionario")
@Getter
@Setter
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "matricula")
    private Integer matricula;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa",nullable = false)
    private Empresa empresa;
}
