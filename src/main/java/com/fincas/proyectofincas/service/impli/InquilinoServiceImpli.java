package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Inquilino;
import com.fincas.proyectofincas.repository.IncidenciaRepository;
import com.fincas.proyectofincas.repository.InquilinoRepository;
import com.fincas.proyectofincas.service.interfaces.InquilinoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InquilinoServiceImpli implements InquilinoInterfaz {
    @Autowired
    private InquilinoRepository InquilinoRepository;
    @Override
    public List<Inquilino> listarTodosInquilino() {
        return InquilinoRepository.findAll();
    }

    @Override
    public Inquilino obtenerInquilinoId(Integer idInquilino) {
        return InquilinoRepository.findById(idInquilino).orElse(null);
    }

    @Override
    public void crearInquilino(Inquilino inquilino) {
        InquilinoRepository.save(inquilino);
    }

    @Override
    public void eliminarInquilino(Integer idInquilino) {
        InquilinoRepository.deleteById(idInquilino);
    }

    @Override
    public void actualizarInquilino(Inquilino inquilino) {
        InquilinoRepository.save(inquilino);
    }
}
