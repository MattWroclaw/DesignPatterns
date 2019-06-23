package pl.sdacademy.designpatterns.observer;

public class ConcreteValueObserver extends Observer {


    public ConcreteValueObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        // chciałoby się zrobić coś takiego subject.getValue() ale nie
        System.out.println("Subject value changed and now is: " + subject.getValue() );
    }
}
