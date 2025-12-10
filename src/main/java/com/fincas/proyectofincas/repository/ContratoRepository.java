package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<Contrato,Integer> {
}
