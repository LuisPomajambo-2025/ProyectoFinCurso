package com.fincas.proyectofincas.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContratoRequestDTO {
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
    @NotEmpty
    private Integer idInquilino;

}
