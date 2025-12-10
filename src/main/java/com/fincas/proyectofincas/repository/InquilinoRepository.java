package com.fincas.proyectofincas.repository;

import com.fincas.proyectofincas.entity.Incidencia;
import com.fincas.proyectofincas.entity.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquilinoRepository extends JpaRepository<Inquilino,Integer> {
}
