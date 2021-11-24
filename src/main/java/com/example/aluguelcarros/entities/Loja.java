package com.example.aluguelcarros.entities;

import javax.persistence.*;

@Entity
@Table(name = "Loja")
public class Loja {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idLoja;

    @OneToOne
    @JoinColumn(name = "FK_id_endereco", referencedColumnName = "idEndereco")
    private Endereco endereco;
}
