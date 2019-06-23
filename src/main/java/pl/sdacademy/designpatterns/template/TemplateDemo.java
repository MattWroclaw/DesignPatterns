package pl.sdacademy.designpatterns.template;

public class TemplateDemo {

    public static void main(String[] args) {
        final PerformanceTestTemplate test = new ListSortPerformanceTest();
        test.run();
    }
}
