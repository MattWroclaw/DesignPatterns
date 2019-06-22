package pl.sdacademy.designpatterns.singleton;


//enum ma prywatne konstruktory więc nie muszę go chować
//do enuma można dostać się po kropce
public enum EnumSingleton {

    //to załatwia 3 rzeczy
    //prywatny konstruktor
    //metoda get instance
    //pole statyczne klasy

    INSTANCE;
}
