package com.fincas.proyectofincas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPropietario;
    @Column(length = 60)
    private String nombre;
    private String dni;
    private String telefono;
    @Column(length = 30)
    private String email;
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "idFinca", referencedColumnName = "idFinca", foreignKey = @ForeignKey(name= "fk_propietario_finca"))
    private Finca finca;

    @OneToMany(mappedBy = "propietario",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch= FetchType.EAGER )
    private List<Piso> pisos;
}
