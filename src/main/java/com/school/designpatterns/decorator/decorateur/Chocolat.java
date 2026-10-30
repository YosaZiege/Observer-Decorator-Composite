package com.school.designpatterns.decorator.decorateur;

import com.school.designpatterns.decorator.composant.Boisson;

public class Chocolat extends DecorateurBoisson {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout() + 1.2;
    }
}
