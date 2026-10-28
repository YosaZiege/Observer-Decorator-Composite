package com.school.designpatterns.decorator.composant;

public class Sumatra extends Boisson {
    public Sumatra() {
        description = "Sumatra";
    }

    @Override
    public double cout() {
        return 6.0;
    }
}
