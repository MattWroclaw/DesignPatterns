package pl.sdacademy.designpatterns.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        final Subject subject = new Subject();

        final Observer observerA = new ConcreteValueObserver(subject);
        final Observer observerB = new ValueLOwerObserver(subject);
        final Observer observerC = new ByTenChangedObserver(subject);

        subject.changeValueBy(2);
        System.out.println("11111111");
        subject.changeValueBy(-1);
        System.out.println("22222222");
        subject.changeValueBy(5);
        System.out.println("33333333");
        subject.changeValueBy(-15);

    }
}
