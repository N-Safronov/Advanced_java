package org.example.animals.Elements;

import org.example.animals.Animals;
import org.example.animals.Entites.TextConstants;


public class Dodo extends Animals {
    @Override
    public void movement() {
        System.out.println(TextConstants.DODO_MOVEMENT);
    }
}
