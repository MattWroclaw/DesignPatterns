package pl.sdacademy.designpatterns.proxy.security;

import java.time.LocalDate;

public class Person {
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Role role;
    private int numOfLogins;
    private boolean verified;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getNumOfLogins() {
        return numOfLogins;
    }

    public void setNumOfLogins(int numOfLogins) {
        this.numOfLogins = numOfLogins;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Person(String name, String email, String phone, LocalDate birthDate, Role role, int numOfLogins, boolean verified) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.birthDate = birthDate;
        this.role = role;
        this.numOfLogins = numOfLogins;
        this.verified = verified;


    }
}
