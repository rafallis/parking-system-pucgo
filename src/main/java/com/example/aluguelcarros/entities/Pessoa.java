package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pessoa")
@Getter
@Setter
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idPessoa")
    private Integer idPessoa;

    @Column(name = "nome", length = 45)
    private String name;

    @Column(name = "CPF", length = 11)
    private String CPF;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
    private Endereco endereco;
}
