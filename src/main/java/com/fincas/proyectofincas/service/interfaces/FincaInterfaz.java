package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.entity.Finca;

import java.util.List;

public interface FincaInterfaz {
    List<Finca> listarTodosFinca();
    Finca obtenerFincaId(Integer idFinca);
    void crearFinca(Finca finca);
    void eliminarFinca(Integer idFinca);
    void actualizarFinca(Finca finca);
}
