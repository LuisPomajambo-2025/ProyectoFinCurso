package com.fincas.proyectofincas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "finca")
public class Finca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFinca;
    @Column(length = 60)
    private String direccion;
    private int numeroPisos;
    @OneToMany(mappedBy = "finca",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch= FetchType.EAGER )
    private List<Propietario> propietarios;
}
