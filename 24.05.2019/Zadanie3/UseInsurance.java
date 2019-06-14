package com.company;

//Lukasz Rachwal s19638
//Damian Brzoskowski s18499

import com.company.Health;
import com.company.Life;

import java.util.Scanner;

public final class UseInsurance {

    private static int input;
    private static Health health;
    private static Life life;


    public static void main(String[] args) {

        menu();
        printInsurance(input);

    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the insurance company application -> choose the type of insurance: " +
                "\n1 -> Health Insurance " +
                "\n2 -> Life insurance " +
                "\n Selected the: ");

        input = scanner.nextInt();

        switch (input) {
            case 1: {
                health = new Health();
                break;
            }
            case 2: {
                life = new Life();
                break;
            }
        }

        return input;
    }

    private static void printInsurance(int input) {

        if (input == 1) {
            health.display();
        } else if (input == 2) {
            life.display();
        }
    }

}
