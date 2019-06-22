package pl.sdacademy.designpatterns.adapter.systemb;

import java.util.List;
import java.util.Set;

public class SsytemBUser {

    private String fullName;
    private String displayName;
    private String age;
    private Set<String> roles;

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "SsytemBUser{" +
                "fullName='" + fullName + '\'' +
                ", displayName='" + displayName + '\'' +
                ", age='" + age + '\'' +
                ", roles=" + roles +
                '}';
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public SsytemBUser(String fullName, String displayName, String age, Set<String> roles) {
        this.fullName = fullName;
        this.displayName = displayName;
        this.age = age;
        this.roles = roles;
    }
}
