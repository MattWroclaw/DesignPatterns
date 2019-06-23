package pl.sdacademy.designpatterns.observer;

public class ValueLOwerObserver extends Observer {

    private int prevoiusValue;
    public ValueLOwerObserver(Subject subject) {
        super(subject);
        prevoiusValue = subject.getValue();
    }

    @Override
    public void update() {
        if (prevoiusValue > subject.getValue()) {
            System.out.println("Value lowered and now is: " + subject.getValue());
        }
        prevoiusValue = subject.getValue();
    }
}
