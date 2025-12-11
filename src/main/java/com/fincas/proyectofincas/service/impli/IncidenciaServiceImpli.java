package com.fincas.proyectofincas.service.impli;

import com.fincas.proyectofincas.entity.Incidencia;
import com.fincas.proyectofincas.repository.FincaRepository;
import com.fincas.proyectofincas.repository.IncidenciaRepository;
import com.fincas.proyectofincas.service.interfaces.IncidenciaInterfaz;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IncidenciaServiceImpli implements IncidenciaInterfaz {
    @Autowired
    private IncidenciaRepository incidenciaRepository;
    @Override
    public List<Incidencia> listarTodosIncidencia() {
        return incidenciaRepository.findAll();
    }

    @Override
    public Incidencia obtenerIncidenciaId(Integer idIncidencia) {
        return incidenciaRepository.findById(idIncidencia).orElse(null);
    }

    @Override
    public void crearIncidencia(Incidencia incidencia) {
        incidenciaRepository.save(incidencia);
    }

    @Override
    public void eliminarIncidencia(Integer idIncidencia) {
        incidenciaRepository.deleteById(idIncidencia);
    }

    @Override
    public void actualizarIncidencia(Incidencia incidencia) {
        incidenciaRepository.save(incidencia);
    }
}
