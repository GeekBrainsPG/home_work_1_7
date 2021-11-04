package com.lesson7;

import com.lesson7.model.Cat;
import com.lesson7.model.Plate;

import java.util.ArrayList;
import java.util.List;

public class ApplicationLauncher {

    public static void main(String[] args) {
        Plate plate = new Plate(40);
        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat("Cat 1", 5));
        cats.add(new Cat("Cat 2", 10));
        cats.add(new Cat("Cat 3", 20));
        cats.add(new Cat("Cat 4", 15));
        cats.add(new Cat("Cat 5", 10));

        for (Cat cat : cats) {
            if (!plate.isFoodEnough(cat.getAppetite())) {
                plate.reFillPlate();

                System.out.println("Тарелка снова полная");
            }

            cat.eat(plate);
            System.out.println(cat);
        }
    }

}
