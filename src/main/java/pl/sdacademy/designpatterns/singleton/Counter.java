package pl.sdacademy.designpatterns.singleton;


// ta klasa jest naszym singletonem
// można go pobrać za pomocą getInstance
//nie można go zrobić konstruktorem

//ingleton na polu statycznym

// przykład EAGER
public class Counter {
    private static Counter counter = new Counter(); // poza tą klasą nikt tego konstruktora nie dotknie
    private int value = 0;

    public static Counter getInstance() {
        return counter;
    }

    // konstruktor w polu statycznym, żeby gni nikt nie zwrócił
    private Counter() {
    }

    public void addOne(){
        value++;
        System.out.println("Value is now: "+value);
    }
    public void addTwo(){
        value +=2;
        System.out.println("Value is now increased by 2: " +value);
    }

    public void addThree(){
        value +=3;
        System.out.println("Value increased by 3 and now: "+ value);
    }
}
