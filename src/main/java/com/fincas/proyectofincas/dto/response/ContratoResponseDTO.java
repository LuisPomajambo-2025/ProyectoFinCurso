package com.fincas.proyectofincas.dto.response;

import com.fincas.proyectofincas.entity.Incidencia;
import com.fincas.proyectofincas.entity.Inquilino;
import com.fincas.proyectofincas.entity.Pago;
import com.fincas.proyectofincas.entity.Piso;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContratoResponseDTO {
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
    private Inquilino inquilino;
    private Piso piso;
    private List<Pago> pagos;
    private List<Incidencia> incidencias;

}
