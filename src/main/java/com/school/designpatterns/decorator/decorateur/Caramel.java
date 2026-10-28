package com.school.designpatterns.decorator.decorateur;

import com.school.designpatterns.decorator.composant.Boisson;

public class Caramel extends DecorateurBoisson {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.8;
    }
}
