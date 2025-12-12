package com.fincas.proyectofincas.controller;

import com.fincas.proyectofincas.dto.request.ContratoRequestDTO;
import com.fincas.proyectofincas.entity.Contrato;
import com.fincas.proyectofincas.service.interfaces.ContratoInterfaz;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contrato")
public class ContratoController {
    @Autowired
    private ContratoInterfaz contratoService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<ContratoRequestDTO>> listarTodosContratos() {
        List<ContratoRequestDTO> contratoServiceDTO = contratoService.listarTodosContratos()
                .stream()
                .map(contrato -> modelMapper.map(contrato, ContratoRequestDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(contratoServiceDTO, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<ContratoRequestDTO> crearUnPuestoTrabajo(@Valid @RequestBody ContratoRequestDTO contratoDTO){
        Contrato contrato = modelMapper.map(contratoDTO, Contrato.class);
        Contrato contratoBBDD = contratoService.crearContrato(contrato);
        return new ResponseEntity<>(modelMapper.map(contratoBBDD, ContratoRequestDTO.class), HttpStatus.CREATED);
    }
}
