package pl.sdacademy.designpatterns.adapter.systema;

import pl.sdacademy.designpatterns.adapter.User;

import java.util.List;


public class SystemAUserAdapter implements User {

    private  SystemAUser systemAUser;
    public SystemAUserAdapter(final SystemAUser systemAUser){
        this.systemAUser = systemAUser;
    }


    @Override
    public String getFullname() {
       return systemAUser.getFirstName()+" "+systemAUser.getLastName();
    }

    @Override
    public String getUsername() {
        return systemAUser.getLastName()+ " "+systemAUser.getLastName();
    }


    @Override
    public Integer getAge() {
        return (int) systemAUser.getAge();
    }

    @Override
    public List<String> getRoles() {
        return systemAUser.getRoles();
    }

}
