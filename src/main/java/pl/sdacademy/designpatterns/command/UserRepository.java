package pl.sdacademy.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

//odpowiada za przechowywabie użytkowników, kasowanie i dodawanie użytkowników
public class UserRepository {

    List<UserData> userData = new ArrayList<>();

    public void addUser(final UserData user){
        userData.add(user);
    }

    public void removeUser (final UserData user){
        userData.remove(user);
    }

    public List<UserData> getUserData() {
        return userData;
    }
}
