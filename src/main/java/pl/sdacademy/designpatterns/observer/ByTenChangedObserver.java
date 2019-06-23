package pl.sdacademy.designpatterns.observer;

public class ByTenChangedObserver extends Observer {

    private int prevoiusValue;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        prevoiusValue = subject.getValue();
    }

    @Override
    public void update() {
        if (Math.abs(prevoiusValue - subject.getValue())>= 10 ) {
            System.out.println("Value changed at last ten and now is :" + subject.getValue());
        }
        prevoiusValue = subject.getValue();
    }
}
