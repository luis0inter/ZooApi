package com.zooapi.model;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Habitat {
    public Habitat(String nombre, int capacidad, int habitatID){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.animales = new ArrayList<>();
        this.habitatID = habitatID;
    }
    public int habitatID;
    public String nombre;
    public int capacidad;
    public List<Animal> animales;
}
