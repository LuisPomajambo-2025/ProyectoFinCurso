package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Finca;
import com.fincas.proyectofincas.entity.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<Incidencia,Integer> {
}
