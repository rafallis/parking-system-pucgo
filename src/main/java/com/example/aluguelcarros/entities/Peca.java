package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Peca")
@Getter
@Setter
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPeca")
    private Integer idPeca;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "quantidadeEstoque")
    private Integer quantidadeEstoque;

    @ManyToOne
    @JoinColumn(name = "pedidoVenda", referencedColumnName = "idPedidoDeVenda")
    private PedidoDeVenda pedidoDeVenda;
}
