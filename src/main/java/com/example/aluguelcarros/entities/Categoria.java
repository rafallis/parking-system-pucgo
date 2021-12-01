package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Categoria")
@Getter
@Setter
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCategoria")
    private Integer idCategoria;

    @Column(name = "descricao", length = 45)
    private String descricao;

    @Column(name = "sigla", length = 5)
    private String sigla;
}
