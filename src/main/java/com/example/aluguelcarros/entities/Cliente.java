package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cliente")
@Getter
@Setter
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCliente")
    private Integer idCliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoa;

    @Column(name = "pontuacao")
    private Integer pontuacao;
}
