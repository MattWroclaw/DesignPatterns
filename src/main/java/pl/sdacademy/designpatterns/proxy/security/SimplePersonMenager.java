package pl.sdacademy.designpatterns.proxy.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimplePersonMenager implements PersonMenager {

    private List<Person> users = new ArrayList<>();


    //chcemy dodać osobę jeśli nie istenie w mailu,
    // w przeciwnym razie wyrzucamy
         @Override
    public void addPerson(Person person) {

             //klasycznie
//             boolean exist = false;
//             for (final Person p : users){
//                 if (p.getEmail().equalsIgnoreCase(person.getEmail())){
//                     exist=true;
//                     break;
//                 }
//             }
             // ale krócej jest:
        final boolean emailExists = users.stream().anyMatch(p ->p.getEmail().equalsIgnoreCase(person.getEmail()));
        if (!emailExists){
            users.add(person);
        }else {
            //tutaj powinien być wyspecyfikowany typ wyjątku
            throw new RuntimeException("User with given email already exists");
        }

    }

    @Override
    public void deletePerson(final String emaial) {
//    final Optional <Person> presonToDelete =
   users.stream()
            .filter(p->p.getEmail().equalsIgnoreCase(emaial))
            .findFirst()
            .ifPresent(p->users.remove(p));
   }

    @Override
    public List<Person> getAllPeople() {
        return users;
    }

    @Override
    public boolean isPersonPresent(String name) {
//             Sream.of("asd", "qwe", "zxcv")

      return users.stream().allMatch(p->p.getName().equalsIgnoreCase(name));

    }
    // w streamach find first daje Optional
    //stream ma metodę filter

    @Override
    public void validateEmail(String email) {
        users.stream()
                .filter(p->p.getEmail().equalsIgnoreCase(email))
                .findFirst()
                .ifPresent(p->p.setVerified(true));

    }
}
