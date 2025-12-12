package com.fincas.proyectofincas.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PagoRequestDTO {
    private Integer idPago;
    @NotEmpty
    private Date fechaPago;
    @NotEmpty
    private float monto;
    @NotEmpty
    private String estado;
}
