package com.example.aluguelcarros.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrato")
    private Integer idContrato;

    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "dataRetirada")
    private Date dataRetirada;

    @Column(name = "dataDevolucao")
    private Date dataDevolucao;

    @Column(name = "valorDiaria")
    private Double valorDiaria;

    @Column(name = "valorSeguro")
    private Double valorSeguro;

    @OneToOne()
    @JoinColumn(name = "idVeiculo", referencedColumnName = "idVeiculo")
    private Veiculo veiculo;

    @OneToOne()
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    private Cliente cliente;

    @OneToOne()
    @JoinColumn(name = "idFilialRetirada", referencedColumnName = "idFilial")
    private Filial filialRetirada;

    @OneToOne()
    @JoinColumn(name = "idFilialDevolucao", referencedColumnName = "idFilial")
    private Filial filialDevolucao;
}
