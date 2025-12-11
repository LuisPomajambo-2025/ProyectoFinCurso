package com.fincas.proyectofincas.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "inquilino")
public class Inquilino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInquilino;
    @Column(length = 60)
    private String nombre;
    private String dni;
    private String telefono;
    private String email;
    @JsonIgnore
    @OneToOne(mappedBy = "inquilino", cascade = CascadeType.ALL, orphanRemoval = true)
    private Contrato contrato;
}
