package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Marca")
@Getter
@Setter
public class Marca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idMarca")
    private Integer idMarca;

    @Column(name = "nome", length = 45)
    private String nome;
}
