package com.fincas.proyectofincas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "piso")
public class Piso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPiso;
    @Column(length = 60)
    private String direccion;
    private String superficie;
    @Column(length = 60)
    private String descripcion;
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "idPropietario", referencedColumnName = "idPropietario", foreignKey = @ForeignKey(name= "fk_piso_propietario"))
    private Propietario propietario;
    @OneToOne
    @JoinColumn(name = "idContrato", unique = true)
    private Contrato contrato;
}
