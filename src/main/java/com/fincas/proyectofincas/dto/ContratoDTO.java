package com.fincas.proyectofincas.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContratoDTO {
    @NotEmpty
    private Integer idContrato;
    @NotEmpty
    private Date fechaInicio;
    @NotEmpty
    private Date fechaFin;
    @NotEmpty
    private float montoMensual;
    @NotEmpty
    private String estado;

}
