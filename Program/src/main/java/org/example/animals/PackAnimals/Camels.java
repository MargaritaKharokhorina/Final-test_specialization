package main.java.org.example.animals.PackAnimals;

import main.java.org.example.animals.PackAnimal;

import java.text.ParseException;
import java.util.ArrayList;

public class Camels extends PackAnimal {
    public Camels(String name, String birthday, ArrayList skills) throws ParseException {
        super(name, "Верблюд", birthday, skills);
    }
    
}
