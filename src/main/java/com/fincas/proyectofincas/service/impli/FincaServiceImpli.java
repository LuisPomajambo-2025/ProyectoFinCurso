package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.entity.Finca;
import com.fincas.proyectofincas.repository.ContratoRepository;
import com.fincas.proyectofincas.repository.FincaRepository;
import com.fincas.proyectofincas.service.interfaces.FincaInterfaz;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FincaServiceImpli implements FincaInterfaz {
    @Autowired
    private FincaRepository FincaRepository;
    @Override
    public List<Finca> listarTodosFinca() {
        return FincaRepository.findAll();
    }

    @Override
    public Finca obtenerFincaId(Integer idFinca) {
        return FincaRepository.findById(idFinca).orElse(null);
    }

    @Override
    public void crearFinca(Finca finca) {
        FincaRepository.save(finca);
    }

    @Override
    public void eliminarFinca(Integer idFinca) {
        FincaRepository.deleteById(idFinca);
    }

    @Override
    public void actualizarFinca(Finca finca) {
        FincaRepository.save(finca);
    }
}
