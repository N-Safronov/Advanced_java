package org.example.Animals.Elements;

import org.example.Animals.Animals;
import org.example.Animals.Entites.TextConstants;

public class Crocodile extends Animals {
    @Override
    public void movement() {
        System.out.println(TextConstants.CROCODILE_MOVEMENT);
    }
}
