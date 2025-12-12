package com.fincas.proyectofincas.dto.response;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InquilinoResponseDTO {
    private Integer idInquilino;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombre;
    @NotEmpty
    private String dni;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String telefono;
    @NotEmpty
    @Size(min = 3, max = 30)
    private String email;
}
