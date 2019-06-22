package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class CombiCarFactory implements AbstractFactory<Car> {
    //TC - toyota combi - 2.0 silnik
    //A4 - audi a4 combi - 2.5 silnik

    @Override
    public Car create(String type) {
        switch (type) {
            case "TC":
                return createToyotaCombi();
            case "A4":
                return createA4Combi();
        }
        throw new RuntimeException("Unknown sedan type");
    }

    public Car createToyotaCombi() {
        return new Toyota("Corolla", EngineType.DIESE, 2.0D, 4, BodyType.COMBI);
    }

    public Car createA4Combi() {
        return new Audi("Audi combi", EngineType.GASOLINE_NATURALLY_ASPIRATED, 2.5, 6, BodyType.COMBI);
    }


}
