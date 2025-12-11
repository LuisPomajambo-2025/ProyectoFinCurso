package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.repository.ContratoRepository;
import com.fincas.proyectofincas.service.interfaces.ContratoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContratoServiceImpli implements ContratoInterfaz {
    @Autowired
    private ContratoRepository contratoRepository;
    @Override
    public List<Contrato> listarTodosContratos() {
        return contratoRepository.findAll();
    }

    @Override
    public Contrato obtenerContratoId(Integer idContrato) {
        return contratoRepository.findById(idContrato).orElse(null);
    }

    @Override
    public Contrato crearContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public void eliminarContrato(Integer idContrato) {
        contratoRepository.deleteById(idContrato);
    }

    @Override
    public void actualizarContrato(Contrato contrato) {
        contratoRepository.save(contrato);
    }
}
