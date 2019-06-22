package pl.sdacademy.designpatterns.adapter.systemb;

import pl.sdacademy.designpatterns.adapter.User;
import pl.sdacademy.designpatterns.adapter.systema.SystemAUser;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class SystemBUserAdapter implements User {

    private SsytemBUser ssytemBUser;

    public SystemBUserAdapter(final SsytemBUser ssytemBUser){
        this.ssytemBUser = ssytemBUser;
    }


    @Override
    public String getFullname() {
        return ssytemBUser.getFullName();
    }

    @Override
    public String getUsername() {
        return ssytemBUser.getDisplayName();
    }


    @Override
    public Integer getAge() {
        return Integer.parseInt(ssytemBUser.getAge());
    }

    @Override
    public List<String> getRoles() {
        return new ArrayList<>(ssytemBUser.getRoles());
    }


}
