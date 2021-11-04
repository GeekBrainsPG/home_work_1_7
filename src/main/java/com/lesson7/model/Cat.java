package com.lesson7.model;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (plate.isFoodEnough(appetite)) {
            plate.decreaseFood(appetite);
            this.isFull = true;
        } else {
            this.isFull = false;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + isFull +
                '}';
    }
}
