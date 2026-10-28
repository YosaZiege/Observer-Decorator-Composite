package com.school.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private final List<Integer> history = new ArrayList<>();

    @Override
    public void update(int state) {
        history.add(state);

        double sum = 0;
        for (int value : history) {
            sum += value;
        }
        double average = sum / history.size();

        System.out.println("ObserverImpl2 : average = " + average);
    }
}
