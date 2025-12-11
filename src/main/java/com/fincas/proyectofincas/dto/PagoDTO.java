package com.fincas.proyectofincas.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class PagoDTO {
    private int idPago;
    @NotEmpty
    private Date fechaPago;
    @NotEmpty
    private float monto;
    @NotEmpty
    private String estado;
}
