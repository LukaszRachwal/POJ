package com.company;

//Lukasz Rachwal s19638
//Damian Brzoskowski s18499

import com.company.Turner;

public class Leaf implements Turner {
    @Override

    public void turn() {
        System.out.println("Changing colors");
    }
}
