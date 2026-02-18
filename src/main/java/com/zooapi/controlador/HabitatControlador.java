package com.zooapi.controlador;

import com.zooapi.model.Habitat;
import com.zooapi.servicio.HabitatServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/habitats")
public class HabitatControlador {
    private final HabitatServicio habitatServicio;
    public HabitatControlador(HabitatServicio habitatServicio){
        this.habitatServicio = habitatServicio;
    }
    @GetMapping
    public ResponseEntity<List<Habitat>> obtenerHabitats(){
        return new ResponseEntity<>(habitatServicio.obtenerHabitats(), HttpStatus.OK);
    }
}