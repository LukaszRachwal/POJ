package com.company;

//Lukasz Rachwal s19638
//Damian Brzoskowski s18499

import java.text.DecimalFormat;

public class PizzaDeluxe extends Pizza {

    private String ingredient_1;
    private String ingredient_2;
    private String ingredient_3;

    public PizzaDeluxe(double calories, String name, double price) {
        super(calories, name, price);
    }

    public PizzaDeluxe(double calories, String name, double price, String ingredient_1, String ingredient_2, String ingredient_3) {
        super(calories, name, price);
        this.ingredient_1 = ingredient_1;
        this.ingredient_2 = ingredient_2;
        this.ingredient_3 = ingredient_3;
    }

    public String getIngredient_1() {
        return ingredient_1;
    }

    public String getIngredient_2() {
        return ingredient_2;
    }

    public String getIngredient_3() {
        return ingredient_3;
    }

    @Override
    public String toString() {
        return "\nPizza Deluxe: " + "" +
                "\nName: " + getName() +
                "\nIngredient 1: " + getIngredient_1() +
                "\nIngredient 2: " + getIngredient_2() +
                "\nIngredient 3: " + getIngredient_3() +
                "\nCalories: " + getCalories()+
                "\nPrice: " + getPrice();
    }
}
