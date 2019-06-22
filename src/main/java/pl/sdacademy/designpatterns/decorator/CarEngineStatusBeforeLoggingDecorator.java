package pl.sdacademy.designpatterns.decorator;


//to jest nasz dekorator
public class CarEngineStatusBeforeLoggingDecorator implements EngineStarter {
    private EngineStarter engineStarter;

    // konstrultor z bazowym intefejsem jako parametr
    //umożliwia używanie ciągu "new" dla wielu dekoratorów
    public CarEngineStatusBeforeLoggingDecorator(final EngineStarter engineStarter) {
        this.engineStarter = engineStarter;
    }

    @Override
    public void startEngine() {
        // nie zmieniamy zachowania bazowego tylko go dekorujemy
        System.out.println("Engie will start in a second");
        engineStarter.startEngine();
    }

    @Override
    public void sotpEngine() {
        System.out.println("Engine will stop in a second");
    engineStarter.sotpEngine();
    }
}
