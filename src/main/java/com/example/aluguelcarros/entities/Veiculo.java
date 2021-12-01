package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.ui.Model;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idModelo", referencedColumnName = "idModelo")
    private Modelo modelo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "idGaragem", referencedColumnName = "idGaragem", nullable = false, unique = true)
    private Garagem garagem;
}
