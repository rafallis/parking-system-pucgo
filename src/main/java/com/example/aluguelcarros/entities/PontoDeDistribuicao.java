package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PontoDeDistribuicao")
@Getter
@Setter
public class PontoDeDistribuicao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPontoDeDistribuicao;

    @ManyToOne
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", nullable = false, unique = true)
    private Empresa empresa;

}
