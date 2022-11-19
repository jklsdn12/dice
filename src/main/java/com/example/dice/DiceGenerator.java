package com.example.dice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class DiceGenerator {
    private final List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> observerIterator = observerList.iterator();
        while (observerIterator.hasNext()) {
            try {
                Observer observer = observerIterator.next();
                observer.update(this);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public abstract DiceVo getDiceVo();

    public abstract void execute();
}