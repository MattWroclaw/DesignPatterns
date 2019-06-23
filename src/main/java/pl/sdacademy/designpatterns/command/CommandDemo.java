package pl.sdacademy.designpatterns.command;

public class CommandDemo {
    public static void main(String[] args) {
        final UserRepository userRepository = new UserRepository();

        final UserData userA = new UserData("as@gmail.com", "Andrzej", "Nowal", "Nowak_123");
        final UserData userB = new UserData("as@gmail.com", "Jan", "Jankowski", "Pass_123");

        final CommandBase commandA = new UserRegistrationCommand(userRepository, userA);
        final CommandBase commandD = new UserRegistrationCommand(userRepository, userB);

        commandA.execute();
        commandA.execute();
        commandA.undo();
        commandA.execute();
        commandA.undo();
        commandD.execute();
        commandD.execute();
// w tym wyrażeniu lambda wykorzystujemy interfejs Consumer, który tylko przyjmuje Obiekt i nic nie robi (void)
//        metoda jest w forEach i jest w bibliotece Javy (nie trzeba jej pisać)
        userRepository.getUserData().forEach(user -> System.out.println(user.getSurname()));

//        procesJavaGda26Consumer(x-> {
//            System.out.println("co?");
//        });

    }
//    public static void procesJavaGda26Consumer(final JavaGda26<String > str){
//        str.customConsume("hello");
//    }
}
