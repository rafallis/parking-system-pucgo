package com.example.aluguelcarros.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private Integer idGaragem;

    @JsonManagedReference
    @OneToMany(mappedBy = "garagem")
    private List<Veiculo> veiculos;
}
