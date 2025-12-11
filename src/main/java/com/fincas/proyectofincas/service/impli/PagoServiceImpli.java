package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Pago;
import com.fincas.proyectofincas.repository.IncidenciaRepository;
import com.fincas.proyectofincas.repository.PagoRepository;
import com.fincas.proyectofincas.service.interfaces.PagoInterfaz;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PagoServiceImpli implements PagoInterfaz {
    @Autowired
    private PagoRepository pagoRepository;
    @Override
    public List<Pago> listarTodosPago() {
        return pagoRepository.findAll();
    }

    @Override
    public Pago obtenerPagoId(Integer idPago) {
        return pagoRepository.findById(idPago).orElse(null);
    }

    @Override
    public void crearPago(Pago pago) {
        pagoRepository.save(pago);
    }

    @Override
    public void eliminarPago(Integer idPago) {
        pagoRepository.deleteById(idPago);
    }

    @Override
    public void actualizarPago(Pago pago) {
        pagoRepository.save(pago);
    }
}
