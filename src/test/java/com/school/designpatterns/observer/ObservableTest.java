package com.school.designpatterns.observer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObservableTest {

    @Test
    void notifiesSubscribedObservers() {
        ObservableImpl observable = new ObservableImpl();
        List<Integer> received = new ArrayList<>();
        observable.subscribe(received::add);

        observable.setState(42);

        assertEquals(List.of(42), received);
    }

    @Test
    void doesNotNotifyUnsubscribedObservers() {
        ObservableImpl observable = new ObservableImpl();
        List<Integer> received = new ArrayList<>();
        Observer observer = received::add;

        observable.subscribe(observer);
        observable.unsubscribe(observer);
        observable.setState(42);

        assertTrue(received.isEmpty());
    }
}
