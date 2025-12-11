package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Pago;
import com.fincas.proyectofincas.entity.Propietario;

import java.util.List;

public interface PropietarioInterfaz {
    List<Propietario> listarTodosPropietario();
    Propietario obtenerPropietarioId(Integer idPropietario);
    void crearPropietario(Propietario propietario);
    void eliminarPropietario(Integer idPropietario);
    void actualizarPropietario(Propietario propietario);
}
