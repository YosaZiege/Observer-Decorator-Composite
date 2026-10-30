package com.school.designpatterns.decorator.decorateur;

import com.school.designpatterns.decorator.composant.Boisson;

public class Noisette extends DecorateurBoisson {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " à la noisette";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }
}
