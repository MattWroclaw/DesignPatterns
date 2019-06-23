package pl.sdacademy.designpatterns.adapter;

import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUserAdapter;
import pl.sdacademy.designpatterns.adapter.systemb.SsytemBUser;
import pl.sdacademy.designpatterns.adapter.systemb.SystemBUserAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

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

        String inStr = "Wyrażenie lambda rozszerzające Javę";
        String outStr;

        System.out.println("łańcuch wejściowy: "+ inStr);

        outStr = stringOp( (String jakis)-> {
            String wynik = "";
            for (int i = 0 ; i<jakis.length(); i++){
                if(jakis.charAt(i) != ' '){
                    wynik += jakis.charAt(i);
                }
            }return wynik;
        }, inStr);

        System.out.println(outStr);

        InterfejsFunkcyjny odwr = (str)->{
            String odw = "";
            for (int i =str.length()-1 ; i>0 ;i--){
                odw += str.charAt(i);
            }
            return odw;
        };
        System.out.println(stringOp(odwr, inStr));

    }
    static String stringOp(InterfejsFunkcyjny infu, String s){
        return infu.funk(s);
    }

}
