package pl.sdacademy.designpatterns.command;

import pl.sdacademy.designpatterns.adapter.User;

public class UserRegistrationCommand implements CommandBase {

    //zle:
    //provate UserRepository userRepositowy = new UserRepository

    //dobrze:
    // private UserRepository userRepository (bo nie jestesmy związani z jedną
    //konkretną implementacją

    // zasada Dependency injection
    private UserRepository userRepository;
    private UserData user;

    public UserRegistrationCommand(final UserRepository userRepository, final UserData user) {
        this.userRepository = userRepository;
        this.user = user;
    }

    //3 interfejsy Consumer, Functional, Predicate (bool), które są przydatne do lambdy (też na slajdach)
    @Override
    public void execute() {
        final boolean mailExist = userRepository.getUserData().stream().anyMatch(ud -> ud.getEmail().equals(user.getEmail()));
        if (!mailExist) {
            userRepository.addUser(user);
        }
    }

    @Override
    public void undo() {
        userRepository.removeUser(user);
    }
}
