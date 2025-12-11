package com.fincas.proyectofincas.service.interfaces;

import com.fincas.proyectofincas.entity.Incidencia;
import com.fincas.proyectofincas.entity.Inquilino;

import java.util.List;

public interface InquilinoInterfaz {
    List<Inquilino> listarTodosInquilino();
    Inquilino obtenerInquilinoId(Integer idInquilino);
    void crearInquilino(Inquilino inquilino);
    void eliminarInquilino(Integer idInquilino);
    void actualizarInquilino(Inquilino inquilino);
}
