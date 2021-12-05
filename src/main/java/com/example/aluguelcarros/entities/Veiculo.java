package com.example.aluguelcarros.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Veiculo")
@Getter
@Setter
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idVeiculo")
    private Integer idVeiculo;

    @Column(name = "placa")
    private String placa;

    private Integer idModelo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    private Categoria categoria;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idGaragem")
    private Garagem garagem;
}
