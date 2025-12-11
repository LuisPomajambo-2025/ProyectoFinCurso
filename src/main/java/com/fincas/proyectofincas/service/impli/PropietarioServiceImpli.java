package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Pago;
import com.fincas.proyectofincas.entity.Propietario;
import com.fincas.proyectofincas.repository.PagoRepository;
import com.fincas.proyectofincas.repository.PropietarioRepository;
import com.fincas.proyectofincas.service.interfaces.PropietarioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PropietarioServiceImpli implements PropietarioInterfaz {
    @Autowired
    private PropietarioRepository propietarioRepository;
    @Override
    public List<Propietario> listarTodosPropietario() {
        return propietarioRepository.findAll();
    }

    @Override
    public Propietario obtenerPropietarioId(Integer idPropietario) {
        return propietarioRepository.findById(idPropietario).orElse(null);
    }

    @Override
    public void crearPropietario(Propietario propietario) {
        propietarioRepository.save(propietario);
    }

    @Override
    public void eliminarPropietario(Integer idPropietario) {
        propietarioRepository.deleteById(idPropietario);
    }

    @Override
    public void actualizarPropietario(Propietario propietario) {
        propietarioRepository.save(propietario);
    }
}
