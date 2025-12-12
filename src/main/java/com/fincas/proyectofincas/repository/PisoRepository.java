package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Pago;
import com.fincas.proyectofincas.entity.Piso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PisoRepository extends JpaRepository<Piso,Integer> {
}
