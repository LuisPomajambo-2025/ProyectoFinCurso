package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.entity.Finca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FincaRepository extends JpaRepository<Finca,Integer> {
}
