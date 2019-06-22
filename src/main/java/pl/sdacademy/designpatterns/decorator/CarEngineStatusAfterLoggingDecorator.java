package pl.sdacademy.designpatterns.decorator;

public class CarEngineStatusAfterLoggingDecorator implements EngineStarter {

    private EngineStarter engineStarter;

    public CarEngineStatusAfterLoggingDecorator(final EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        engineStarter.startEngine();
        System.out.println("Engine just started");

    }

    @Override
    public void sotpEngine() {
        engineStarter.sotpEngine();
        System.out.println("Engine just stopped");
    }
}
