package com.fincas.proyectofincas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;
    @Column(length = 60)
    private String nombre;
    @Column(length = 30)
    private String password;

    public void registrarFinca() {

    }

    public void registrarPropietario() {

    }

    public void registrarInquilino() {

    }

    public void crearContrato() {

    }

    public void registrarPago() {

    }

    public void registrarIncidencia() {

    }

}
