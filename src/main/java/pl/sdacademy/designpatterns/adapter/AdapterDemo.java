package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemb.SsytemBUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUserAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {

        final SystemAUser systemAUser = new SystemAUser("Michał", "Bocian", 22, Collections.singletonList("USER"));
        final SsytemBUser ssytemBUser = new SsytemBUser("Andrzej Nowak", "Endrju", "33", Collections.singleton("ADMIN"));

        final User userA = new SystemAUserAdapter(systemAUser);
        final User userB = new SystemBUserAdapter(ssytemBUser);

        List<User> users = Arrays.asList(userA, userB);

        System.out.println(userA.getFullname());
        System.out.println(userA.getAge());
        System.out.println(userA.getUsername());
        System.out.println(userA.getRoles());

        System.out.println(userB.getFullname());
        System.out.println(userB.getAge());
        System.out.println(userB.getUsername());
        System.out.println(userB.getRoles());


    }
}
