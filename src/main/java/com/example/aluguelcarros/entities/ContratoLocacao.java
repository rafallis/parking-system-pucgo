package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ContratoLocacao")
@Getter
@Setter
public class ContratoLocacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idContrato")
    private Integer idContrato;

    @Column(name = "dataRetirada")
    private Date dataRetirada;

    @Column(name = "dataDevolucao")
    private Date dataDevolucao;

    @Column(name = "valorDiaria")
    private Double valorDiaria;

    @Column(name = "valorSeguro")
    private Double valorSeguro;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idVeiculo", referencedColumnName = "idVeiculo")
    private Veiculo veiculo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    private Cliente cliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFilialRetirada", referencedColumnName = "idFilial")
    private Filial filialRetirada;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idFilialDevolucao", referencedColumnName = "idFilial")
    private Filial filialDevolucao;
}
