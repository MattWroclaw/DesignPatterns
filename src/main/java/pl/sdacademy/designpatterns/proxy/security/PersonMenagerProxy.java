package pl.sdacademy.designpatterns.proxy.security;

import java.util.Collections;
import java.util.List;

public class PersonMenagerProxy implements PersonMenager {

    private PersonMenager personMenager;
    private Person managingPerson;

    public PersonMenagerProxy(final PersonMenager personMenager, final Person managingPerson) {
        this.personMenager = personMenager;
        this.managingPerson = managingPerson;
    }

    @Override
    public void addPerson(final Person person) {
        if (managingPerson.getRole().getAccesTypes().contains(AccesType.WRITE)) {
             personMenager.addPerson(person);
        }
    }

    @Override
    public void deletePerson(final String emaial) {
        if (managingPerson.getRole().getAccesTypes().contains(AccesType.WRITE)) {
            personMenager.deletePerson(emaial);
        }

    }

    @Override
    public List<Person> getAllPeople() {
        if (managingPerson.getRole().getAccesTypes().contains(AccesType.READ)){

        return personMenager.getAllPeople();
        }
        return Collections.emptyList(); // jak nie ma praw do wyświetlania to dajemy
        // pustą listę
    }

    @Override
    public boolean isPersonPresent(final String name) {
//        if (managingPerson.getRole().getAccesTypes().contains(AccesType.READ)){

         if(hasAccessType(AccesType.READ)){
            return personMenager.isPersonPresent(name);
        }
        return false;
    }

    @Override
    public void validateEmail(final String email) {
//        if (managingPerson.getRole().getAccesTypes().contains(AccesType.WRITE)){
          if(hasAccessType(AccesType.WRITE)){
            personMenager.validateEmail(email);
        }
    }

    private boolean hasAccessType(final AccesType accesType){
        return managingPerson.getRole().getAccesTypes().contains(accesType);
    }
}
