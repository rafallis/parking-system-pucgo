package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Endereco")
@Getter
@Setter
public class Endereco {

    @Id
    @Column(name = "idEndereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;

    @Column(name = "CEP", nullable = false, length = 8)
    private String cep;

    @Column(name = "rua", length = 45)
    private String rua;

    @Column(name = "bairroSetor", length = 45)
    private String bairroSetor;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "quadra", length = 10)
    private String quadra;

    @Column(name = "lote", length = 10)
    private String lote;
}
