package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Modelo")
@Getter
@Setter
public class Modelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idModelo")
    private Integer idMOdelo;

    @Column(name = "nome", length = 45)
    private String Nome;
}
