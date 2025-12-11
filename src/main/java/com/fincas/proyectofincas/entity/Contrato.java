package com.fincas.proyectofincas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrato;
    private Date fechaInicio;
    private Date fechaFin;
    private float montoMensual;
    private String estado;
    @OneToOne
    @JoinColumn(name = "idInquilino", unique = true)
    private Inquilino inquilino;

    @OneToMany(mappedBy = "contrato",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch= FetchType.EAGER )
    private List<Pago> pagos;

    @OneToMany(mappedBy = "contrato",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch= FetchType.EAGER )
    private List<Incidencia> incidencias;

    @JsonIgnore
    @OneToOne(mappedBy = "contrato", cascade = CascadeType.ALL, orphanRemoval = true)
    private Piso piso;
}
