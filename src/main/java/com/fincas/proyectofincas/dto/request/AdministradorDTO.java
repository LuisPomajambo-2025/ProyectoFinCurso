package com.fincas.proyectofincas.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdministradorDTO {

    private int idAdmin;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombre;
    @NotEmpty
    @Size(min = 3, max = 30)
    private String password;
}
