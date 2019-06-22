package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class FactoryDemo {

    public static void main(String[] args) {

        final FactoryCategory factoryCategory = FactoryCategory.SEDANS;

        final AbstractFactory<Car> factory = FactoryProvider.getFactory(factoryCategory);

        final Car car = factory.create("TC");

        System.out.println(car.getBodyType());
        System.out.println(car.getModelName());
    }
}
