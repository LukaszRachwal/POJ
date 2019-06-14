package com.company;

//Lukasz Rachwal s19638
//Damian Brzoskowski s18499

import com.company.Pizza;
import com.company.PizzaDeluxe;
import com.company.PizzaSpecial;
import com.company.PizzaWoggy;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;


public class PizzaApp {
    private static ArrayList<Pizza> pizza = new ArrayList<>();
    private static Random random = new Random();
    private static String[] names = {"NewYork", "Roma", "Madrid", "Warsa", "Paris", "Oslo"};
    private static String[] ingredients = {"Jam", "Onion", "Cheese",
            "Chicken", "Garlic", "Pepperoni",
            "Pepper", "Tomato", "Jalapeno", "Jamon Cerrano", "Pineapple"};

    public static void main(String[] args) {
        createPizza();
        printPizza();
        printSortedPizzaPrice();
    }

    private static void createPizza() {

        for (int i = 0; i < 40; i++) {
            int x = random.ints(1, 4).findFirst().getAsInt();
            int name = random.ints(0, 6).findFirst().getAsInt();
            int ingredient_1 = random.ints(0, 11).findFirst().getAsInt();
            int ingredient_2 = random.ints(0, 11).findFirst().getAsInt();
            int ingredient_3 = random.ints(0, 11).findFirst().getAsInt();
            double price = random.doubles(40, 150).findFirst().getAsDouble();
            double calories = random.doubles(200, 999).findFirst().getAsDouble();

            switch (x) {
                case 1: {
                    pizza.add(new PizzaDeluxe(price, names[name], calories, ingredients[ingredient_1], ingredients[ingredient_2], ingredients[ingredient_3]));
                    break;
                }
                case 2: {
                    pizza.add(new PizzaSpecial(price, names[name], calories, ingredients[ingredient_1], ingredients[ingredient_2], ingredients[ingredient_3]));
                    break;
                }
                case 3: {
                    pizza.add(new PizzaWoggy(price, names[name], calories, ingredients[ingredient_1], ingredients[ingredient_2], ingredients[ingredient_3]));
                    break;
                }
            }

        }
    }

    private static void printPizza() {
        for (int i = 0; i < pizza.size(); i++) {
            System.out.println("number: " + (i + 1) + " \nPizza " + pizzas.get(i));
        }

    }

    private static void printSortedPizzaPrice() {
        Collections.sort(pizza);
        for (Pizza pizza : pizza) {
            System.out.println("Price: " + pizza.getPrice() + " Type: " + pizza.getClass().getSimpleName() + " Pizza: " + pizza.getName());
        }
    }

}
