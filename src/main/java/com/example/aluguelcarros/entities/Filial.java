package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Filial")
@Getter
@Setter
public class Filial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idFilial")
    private Integer idFilial;

    @OneToOne()
    @JoinColumn(name = "idEndereco", referencedColumnName = "idEndereco")
    private Endereco endereco;

    @OneToOne()
    @JoinColumn(name = "idGaragem", referencedColumnName = "idGaragem")
    private Garagem garagem;
}
