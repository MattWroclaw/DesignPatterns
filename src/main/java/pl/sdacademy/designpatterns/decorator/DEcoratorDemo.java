package pl.sdacademy.designpatterns.decorator;

public class DEcoratorDemo {
    public static void main(String[] args) {
//        final EngineStarter engineStarter = new CarEngineStatusAfterLoggingDecorator(new
//                CarEngineStatusBeforeLoggingDecorator(new Car()));


        //zamieniam after z before a zawsze wypisuje to samo
        final EngineStarter engineStarter = new CarEngineStatusBeforeLoggingDecorator(new CarEngineStatusAfterLoggingDecorator(new Car()));
        engineStarter.startEngine();
        engineStarter.sotpEngine();


    }

}
