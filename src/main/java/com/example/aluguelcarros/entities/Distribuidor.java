package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Distribuidor")
@Getter
@Setter
public class Distribuidor implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "matriculaFuncionario", referencedColumnName = "matricula")
    private Funcionario matricula;

    @Column(name = "senha")
    private String senha;

    @Column(name = "nomeUsuario")
    private String nomeUsuario;
}
