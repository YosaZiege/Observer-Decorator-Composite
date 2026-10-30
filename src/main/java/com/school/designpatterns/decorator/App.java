package com.school.designpatterns.decorator;

import com.school.designpatterns.decorator.composant.Boisson;
import com.school.designpatterns.decorator.composant.Espresso;
import com.school.designpatterns.decorator.composant.Sumatra;
import com.school.designpatterns.decorator.decorateur.Caramel;
import com.school.designpatterns.decorator.decorateur.Chantilly;
import com.school.designpatterns.decorator.decorateur.Chocolat;
import com.school.designpatterns.decorator.decorateur.Noisette;

public class App {
    public static void main(String[] args) {
        Boisson boisson = new Sumatra();
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        Boisson espresso = new Chantilly(new Caramel(new Espresso()));
        System.out.println(espresso.getDescription() + " : " + espresso.cout());
    }
}
