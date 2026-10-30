package com.school.designpatterns.decorator.decorateur;

import com.school.designpatterns.decorator.composant.Boisson;

public class Chantilly extends DecorateurBoisson {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " à la chantilly";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }
}
