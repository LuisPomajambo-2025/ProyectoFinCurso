package com.fincas.proyectofincas.dto.request;

import com.fincas.proyectofincas.entity.Contrato;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IncidenciaRequestDTO {
    private Integer idIncidencia;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String descripcion;
    @NotEmpty
    private Date fecha;
    @NotEmpty
    private String estado;
    private Integer idContrato;
}
