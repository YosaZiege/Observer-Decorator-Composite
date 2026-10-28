package com.school.designpatterns.observer;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("ObserverImpl1 : new state = " + state);
    }
}
