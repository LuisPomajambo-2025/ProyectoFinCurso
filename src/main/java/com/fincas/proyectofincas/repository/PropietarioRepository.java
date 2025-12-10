package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Inquilino;
import com.fincas.proyectofincas.entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropietarioRepository extends JpaRepository<Propietario,Integer> {
}
