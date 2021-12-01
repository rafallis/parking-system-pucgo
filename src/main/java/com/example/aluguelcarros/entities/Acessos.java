package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Acessos")
@Getter
@Setter
public class Acessos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAcessos;

    @Column(name = "momento")
    private Timestamp momento;

    @OneToOne
    @JoinColumn(name = "FK_matricula_funcionario", referencedColumnName = "matricula")
    private Funcionario matricula;

    @Column(name = "entrada")
    private Integer entrada;
}
