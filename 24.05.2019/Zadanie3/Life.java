package com.company;

//Lukasz Rachwal s19638
//Damian Brzoskowski s18499

import com.company.UseInsurance;
import com.company.Insurance;

public class Life extends Insurance {

    private final double lifeInsuranceCost = 250;

    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public double setCost() {
        return monthlyPrice = lifeInsuranceCost;
    }

    @Override
    public void display() {
        System.out.println("Type of Insurance: " + getTypeOfInsurance() + ", Cost : " + getMonthlyPrice());
    }

}