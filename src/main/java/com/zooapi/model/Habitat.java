package com.zooapi.model;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitatID() {
        return habitatID;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public void setHabitatID(int habitatID) {
        this.habitatID = habitatID;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
