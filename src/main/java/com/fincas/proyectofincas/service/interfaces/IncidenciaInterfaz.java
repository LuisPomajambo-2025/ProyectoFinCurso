package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.entity.Finca;
import com.fincas.proyectofincas.entity.Incidencia;

import java.util.List;

public interface IncidenciaInterfaz {
    List<Incidencia> listarTodosIncidencia();
    Incidencia obtenerIncidenciaId(Integer idIncidencia);
    void crearIncidencia(Incidencia incidencia);
    void eliminarIncidencia(Integer idIncidencia);
    void actualizarIncidencia(Incidencia incidencia);
}
