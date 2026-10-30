package com.school.designpatterns.decorator.composant;

public class Espresso extends Boisson {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 8.0;
    }
}
