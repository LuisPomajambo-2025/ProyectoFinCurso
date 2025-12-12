package com.fincas.proyectofincas.dto.response;

import com.fincas.proyectofincas.entity.Contrato;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PagoResponseDTO {
    private Integer idPago;
    @NotEmpty
    private Date fechaPago;
    @NotEmpty
    private float monto;
    @NotEmpty
    private String estado;
    private Contrato contrato;
}
