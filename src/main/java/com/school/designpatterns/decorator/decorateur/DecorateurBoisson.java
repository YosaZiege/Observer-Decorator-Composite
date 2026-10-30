package com.school.designpatterns.decorator.decorateur;

import com.school.designpatterns.decorator.composant.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;

    protected DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
