package pl.sdacademy.designpatterns.proxy;

import pl.sdacademy.designpatterns.proxy.security.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProxyDemo {

    public static void main(String[] args) {
      //  final ConfigLoader configLoader = new DataBaseConfigLoader("jdbs:h2:mem.testdb"); <-- tu będzie nam się
        //  pokazuwało 3 razy, 3 razy pobiera
        final ConfigLoader configLoader = new ConfigLoaderProxy(new DataBaseConfigLoader("jdbs:h2:mem.testdb"));

        configLoader.load();
        System.out.println("DDD");
        configLoader.load();
        System.out.println("ddd");
        configLoader.load();

        final Person admin = new Person("Andrzej", "admin@gamil.com", "12344556", LocalDate.now(),
                Role.ADMIN, 2, true);
        final Person user = new Person("MIchał", "user@gads.pd", "234", LocalDate.now(),
                Role.USER, 0, false);

        final PersonMenager personMenager = new PersonMenagerProxy(new SimplePersonMenager(), admin);
        personMenager.addPerson(admin);

        personMenager.getAllPeople().forEach(System.out ::println);
    }
}
