package com.fincas.proyectofincas.dto.response;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PisoResponseDTO {
    private Integer idPiso;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String direccion;
    @NotEmpty
    private String superficie;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String descripcion;
    @NotEmpty
    private Integer idPropietario;
    @NotEmpty
    private Integer idContrato;
}
