package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.entity.Piso;

import java.util.List;

public interface PisoInterfaz {
    List<Piso> listarTodosPisos();
    Piso obtenerPisoId(Integer idPiso);
    Piso crearPiso(Piso piso);
    void eliminarContrato(Integer idPiso);
    void actualizarContrato(Piso piso);
}
