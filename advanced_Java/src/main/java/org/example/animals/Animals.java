package org.example.animals;

import lombok.Getter;
import lombok.Setter;
import org.example.animals.Entites.TypeAnimal;

@Getter
@Setter
public abstract class Animals {
    private Integer weight;
    private Integer speed = 50;
    private Boolean Hunger;
    private String color;
    private TypeAnimal typeAnimal;

    public abstract void movement();

    public void eat(){
        Hunger = false;
        weight++;
    }

    public void sleep(){
        Hunger = true;
        weight--;
    }


}
