package com.company;

//Lukasz Rachwal s19638
//Damian Brzoskowski s18499

import com.company.UseInsurance;
import com.company.Insurance;

public class Health extends Insurance {

    private final double healthInsuranceCost = 500;

    public Health() {
        super("Health");
        setCost();
    }

    @Override
    public double setCost() {
        return monthlyPrice = healthInsuranceCost;
    }

    @Override
    public void display() {
        System.out.println("Type of Insurance: " + getTypeOfInsurance() + ", Cost : " + getMonthlyPrice());
    }
}