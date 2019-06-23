package pl.sdacademy.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int value = 0; //wartość która się zmienia i na którą obserawtorzy będą reagować

    public void subscribe(final  Observer observer){
        observers.add(observer);
    }

    public void changeValueBy(final int changed){
        value+= changed;
        //poinformuj obserwatorów o zmianach
        observers.forEach(Observer::update);
    }

    public int getValue() {
        return value;
    }
}
