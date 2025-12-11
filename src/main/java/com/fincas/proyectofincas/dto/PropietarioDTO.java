package com.fincas.proyectofincas.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PropietarioDTO {
    private int idPropietario;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombre;
    @NotEmpty
    private String dni;
    @NotEmpty
    private String telefono;
    @NotEmpty
    @Size(min = 3, max = 30)
    private String email;
}
