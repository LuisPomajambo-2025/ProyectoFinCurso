package com.fincas.proyectofincas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogError {
    private LocalDateTime fecha;
    private String mensaje;
    private String detalles;
}
