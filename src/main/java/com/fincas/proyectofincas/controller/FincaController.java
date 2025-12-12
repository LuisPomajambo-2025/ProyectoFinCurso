package com.fincas.proyectofincas.controller;

import com.fincas.proyectofincas.dto.request.ContratoRequestDTO;
import com.fincas.proyectofincas.dto.response.ContratoResponseDTO;
import com.fincas.proyectofincas.dto.response.FincaResponseDTO;
import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.service.interfaces.FincaInterfaz;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/finca")
public class FincaController {
    @Autowired
    private FincaInterfaz fincaService;

    @Autowired
    private ModelMapper modelMapper;


}
