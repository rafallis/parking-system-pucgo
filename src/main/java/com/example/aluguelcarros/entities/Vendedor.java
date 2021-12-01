package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Vendedor")
@Getter
@Setter
public class Vendedor implements Serializable {

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "matriculaFuncionario", referencedColumnName = "matricula")
    private Funcionario matricula;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idLoja", referencedColumnName = "idLoja")
    private Loja idLoja;
}
