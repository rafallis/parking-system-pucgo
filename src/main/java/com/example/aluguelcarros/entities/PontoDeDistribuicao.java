package com.example.aluguelcarros.entities;

import javax.persistence.*;

@Entity
@Table(name = "PontoDeDistribuicao")
public class PontoDeDistribuicao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPontoDeDistribuicao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_id_endereco", referencedColumnName = "idEndereco")
    private Endereco endereco;
}
