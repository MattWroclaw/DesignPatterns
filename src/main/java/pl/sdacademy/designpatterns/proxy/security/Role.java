package pl.sdacademy.designpatterns.proxy.security;

import java.util.Arrays;
import java.util.List;

public enum Role {
    USER (AccesType.READ),
    ADMIN(AccesType.READ, AccesType.WRITE);

    private List<AccesType> accesTypes;
    Role(final  AccesType ...accesTypes){ // jak argumentem są varargsy to JEST TO TABLICA!!
        // jak przekonwertować obiekt accesType (tablicę) na Listę?
        this.accesTypes= Arrays.asList(accesTypes); //konwersja varagrsów na listę
    }

    public List<AccesType> getAccesTypes() {
        return accesTypes;
    }
}
