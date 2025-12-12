package com.fincas.proyectofincas.dto.response;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IncidenciaResponseDTO {
    private Integer idIncidencia;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String descripcion;
    @NotEmpty
    private Date fecha;
    @NotEmpty
    private String estado;


}
