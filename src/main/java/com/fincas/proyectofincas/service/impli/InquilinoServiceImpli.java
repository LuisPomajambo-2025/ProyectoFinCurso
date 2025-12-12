package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Inquilino;
import com.fincas.proyectofincas.repository.InquilinoRepository;
import com.fincas.proyectofincas.service.interfaces.InquilinoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InquilinoServiceImpli implements InquilinoInterfaz {
    @Autowired
    private InquilinoRepository inquilinoRepository;
    @Override
    public List<Inquilino> listarTodosInquilino() {
        return inquilinoRepository.findAll();
    }

    @Override
    public Inquilino obtenerInquilinoId(Integer idInquilino) {
        return inquilinoRepository.findById(idInquilino).orElse(null);
    }

    @Override
    public void crearInquilino(Inquilino inquilino) {
        inquilinoRepository.save(inquilino);
    }

    @Override
    public void eliminarInquilino(Integer idInquilino) {
        inquilinoRepository.deleteById(idInquilino);
    }

    @Override
    public void actualizarInquilino(Inquilino inquilino) {
        inquilinoRepository.save(inquilino);
    }
}
