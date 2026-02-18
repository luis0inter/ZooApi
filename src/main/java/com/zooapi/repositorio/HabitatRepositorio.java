package com.zooapi.repositorio;
import com.zooapi.model.Habitat;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class HabitatRepositorio {
    private int habitatID = 1;
    List<Habitat> habitats = new ArrayList<>();


    public HabitatRepositorio(){}
    public Habitat guardarHabitat(Habitat habitat) {
        habitats.add(habitat);
        habitat.setHabitatID(habitatID);
        habitatID++;
        return habitat;
    }
    public List<Habitat> obtenerHabitats(){
        return habitats;
    }
}
