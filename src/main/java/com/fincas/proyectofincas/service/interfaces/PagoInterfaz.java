package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Inquilino;
import com.fincas.proyectofincas.entity.Pago;

import java.util.List;

public interface PagoInterfaz {
    List<Pago> listarTodosPago();
    Pago obtenerPagoId(Integer idPago);
    void crearPago(Pago pago);
    void eliminarPago(Integer idPago);
    void actualizarPago(Pago pago);
}
