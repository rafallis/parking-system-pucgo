package com.example.aluguelcarros.entities;

import javax.persistence.*;

@Entity
@Table(name = "Endereco")
public class Endereco {

    @Id
    @Column(name = "idEndereco")
    private Integer idEndereco;

    @Column(name = "CEP", nullable = false, length = 8)
    private String cep;

    @Column(name = "nome", length = 45)
    private String nome;

    @Column(name = "rua", length = 45)
    private String rua;

    @Column(name = "bairro", length = 45)
    private String bairro;

    @Column(name = "numero")
    private Integer numero;
}
