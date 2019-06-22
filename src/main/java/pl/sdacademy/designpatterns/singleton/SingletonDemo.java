package pl.sdacademy.designpatterns.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        final Counter counterA= Counter.getInstance();
        final Counter counterB = Counter.getInstance();

        counterA.addOne();
        counterA.addThree();

        counterB.addTwo();
        counterB.addThree();
        System.out.println();

        final AppConections appConectionsA = AppConections.getInstance();
        final AppConections appConectionsB = AppConections.getInstance();

        appConectionsA.connectedUser("Andrzej");
        appConectionsB.connectedUser("Michał");

        appConectionsA.getConnectedUsers().forEach(System.out::println);

        final EnumSingleton enumSingletonA = EnumSingleton.INSTANCE;
        final EnumSingleton enumSingletonB = EnumSingleton.INSTANCE;
        // nie możemy stworzyć
    }
}
