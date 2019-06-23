package pl.sdacademy.designpatterns.observer;

public abstract  class Observer {

    protected Subject subject; //protected żeby był widoczny w package w ContreValueObserver

    public Observer(Subject subject) {
        this.subject = subject;
        subject.subscribe(this); //sam siebie chcę zasubstrybkować do tematu
    }

    public abstract void update();

}
