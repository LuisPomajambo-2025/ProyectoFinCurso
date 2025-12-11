package com.fincas.proyectofincas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "incidencia")
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIncidencia;
    @Column(length = 60)
    private String descripcion;
    private Date fecha;
    private String estado;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "idContrato", referencedColumnName = "idContrato", foreignKey = @ForeignKey(name= "fk_incidencia_contrato"))
    private Contrato contrato;
}
