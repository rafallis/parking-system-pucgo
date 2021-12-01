package com.example.aluguelcarros.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Garagem")
@Getter
@Setter
public class Garagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idGaragem")
    private Integer IdGaragem;

    @OneToMany(mappedBy = "garagem")
    private List<Veiculo> veiculos;
}
