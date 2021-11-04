package com.lesson7.model;

public class Plate {

    private int food;
    private static int MAX_AMOUNT;

    public Plate(int food) {
        this.food = food;
        MAX_AMOUNT = food;
    }

    public void decreaseFood(int appetite) {
        if (this.food >= appetite) {
            this.food -= appetite;
        } else {
            System.out.println("Недостаточно еду а тарелке");
        }
    }

    public boolean isFoodEnough(int appetite) {
        return this.food >= appetite;
    }

    public void reFillPlate() {
        this.food = MAX_AMOUNT;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
