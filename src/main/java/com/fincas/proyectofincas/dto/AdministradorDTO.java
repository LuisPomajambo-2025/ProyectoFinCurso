package com.fincas.proyectofincas.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdministradorDTO {

    private int idAdmin;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombre;
    @NotEmpty
    @Size(min = 3, max = 30)
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
