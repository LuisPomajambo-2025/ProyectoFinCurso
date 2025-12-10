package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Incidencia;
import com.fincas.proyectofincas.entity.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago,Integer> {
}
