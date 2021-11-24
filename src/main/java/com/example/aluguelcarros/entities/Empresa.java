package com.example.aluguelcarros.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpresa")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_id_endereco", referencedColumnName = "idEndereco")
    private Endereco endereco;

    @OneToMany(mappedBy = "Empresa")
    private List<PontoDeDistribuicao> pontosDeDistribuicao;

    @OneToMany(mappedBy = "Empresa")
    private List<Funcionario> funcionarios;
}
