package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Contrato;
import org.springframework.beans.factory.ListableBeanFactory;

import java.util.List;

public interface ContratoInterfaz {
    List<Contrato> listarTodosContratos();
    Contrato obtenerContratoId(Integer idContrato);
    void crearContrato(Contrato contrato);
    void eliminarContrato(Integer idContrato);
    void actualizarContrato(Contrato contrato);
}
