package main.java.org.example.animals.Pets;

import main.java.org.example.animals.Pet;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Dogs extends Pet {
    public Dogs(String name, String birthday, ArrayList skills) throws ParseException {
        super(name, "Собака", birthday, skills);
    }
}
