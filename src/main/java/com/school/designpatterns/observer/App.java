package com.school.designpatterns.observer;

public class App {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState(60);
        observable.setState(80);
        observable.setState(100);

        observable.unsubscribe(observer2);
        observable.setState(120);

        observable.subscribe(state -> System.out.println("Anonymous observer : cos = " + Math.cos(state)));
        observable.setState(140);
    }
}
