package pl.sdacademy.designpatterns.factory.car;

import pl.sdacademy.designpatterns.factory.AbstractFactory;

public class SedanCarFactory implements AbstractFactory<Car> {
    //TC - toyota sedan
    //A4 - audi a4 sedan

    @Override
    public Car create(String type) {
        switch (type){
            case "TC":
                return createCorollaSedan();
                //jak jest return to nie trzeba break;
            case "A4":
                return createA4Sedan();
        }
        throw new RuntimeException("Unknown sedan type");

    }

    public Car createCorollaSedan(){
      return   new Toyota("Corolla", EngineType.GASOLINE_NATURALLY_ASPIRATED, 1.6D, 4, BodyType.SEDAN);

    }

    private Car createA4Sedan(){
        return new Audi("Audi A4", EngineType.DIESE, 2.0D, 4, BodyType.SEDAN);
    }
}
