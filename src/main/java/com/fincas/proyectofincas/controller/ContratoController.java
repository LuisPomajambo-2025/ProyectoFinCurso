package com.fincas.proyectofincas.controller;

import com.fincas.proyectofincas.dto.ContratoDTO;
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
    public ResponseEntity<List<ContratoDTO>> listarTodosContratos() {
        List<ContratoDTO> contratoServiceDTO = contratoService.listarTodosContratos()
                .stream()
                .map(contrato -> modelMapper.map(contrato, ContratoDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(contratoServiceDTO, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<ContratoDTO> crearUnPuestoTrabajo(@Valid @RequestBody ContratoDTO contratoDTO){
        Contrato contrato = modelMapper.map(contratoDTO, Contrato.class);
        Contrato contratoBBDD = contratoService.crearContrato(contrato);
        return new ResponseEntity<>(modelMapper.map(contratoBBDD, ContratoDTO.class), HttpStatus.CREATED);
    }
}
