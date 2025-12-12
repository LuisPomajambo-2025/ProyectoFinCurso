package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Pago;
import com.fincas.proyectofincas.entity.Piso;
import com.fincas.proyectofincas.repository.PagoRepository;
import com.fincas.proyectofincas.repository.PisoRepository;
import com.fincas.proyectofincas.service.interfaces.PagoInterfaz;
import com.fincas.proyectofincas.service.interfaces.PisoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PisoServiceImpli implements PisoInterfaz {
    @Autowired
    private PisoRepository pisoRepository;

    @Override
    public List<Piso> listarTodosPisos() {
        return pisoRepository.findAll();
    }

    @Override
    public Piso obtenerPisoId(Integer idPiso) {
        return pisoRepository.findById(idPiso).orElse(null);
    }

    @Override
    public Piso crearPiso(Piso piso) {
        return pisoRepository.save(piso);
    }

    @Override
    public void eliminarContrato(Integer idPiso) {
        pisoRepository.deleteById(idPiso);
    }

    @Override
    public void actualizarContrato(Piso piso) {
        pisoRepository.save(piso);
    }
}
