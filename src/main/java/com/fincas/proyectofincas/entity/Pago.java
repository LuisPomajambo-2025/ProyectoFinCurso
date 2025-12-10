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
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    private Date fechaPago;
    private float monto;
    private String estado;
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "idContrato", referencedColumnName = "idContrato", foreignKey = @ForeignKey(name= "fk_pago_contrato"))
    private Contrato contrato;
}
