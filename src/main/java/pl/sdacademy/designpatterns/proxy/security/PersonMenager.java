package pl.sdacademy.designpatterns.proxy.security;

import java.util.List;

public interface PersonMenager {
// w interfejsie nie musimy używać finally, bo to nic nie zmieni. Ta metoda nie ma ciała!
    void addPerson(Person person);
    void deletePerson(String emaial);
    List<Person> getAllPeople();
    boolean isPersonPresent(String name);
    void validateEmail(String email);

}