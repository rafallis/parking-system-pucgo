package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PedidoDeVenda")
@Getter
@Setter
public class PedidoDeVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPedidoDeVenda")
    private Integer idPedidoDeVenda;

    @OneToMany(mappedBy = "pedidoDeVenda")
    private List<Peca> pecas;

    @OneToOne
    @JoinColumn(name = "idVendedor", referencedColumnName = "matriculaFuncionario")
    private Vendedor vendedor;

    @OneToOne
    @JoinColumn(name = "matDistribuidor", referencedColumnName = "matriculaFuncionario")
    private Distribuidor distribuidor;

    @OneToOne
    @JoinColumn(name = "idLoja", referencedColumnName = "idLoja")
    private Loja loja;

    @Column(name = "entregue")
    private Boolean entregue;
}
