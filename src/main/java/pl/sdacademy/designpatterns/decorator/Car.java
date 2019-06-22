package pl.sdacademy.designpatterns.decorator;

public class Car implements EngineStarter {
    private boolean engineStarted;


    @Override
    public void startEngine() {
        engineStarted = true;
    }

    @Override
    public void sotpEngine() {
        engineStarted = false;
    }
}
