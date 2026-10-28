package com.school.designpatterns.decorator.composant;

public class Deca extends Boisson {
    public Deca() {
        description = "Déca";
    }

    @Override
    public double cout() {
        return 8.0;
    }
}
