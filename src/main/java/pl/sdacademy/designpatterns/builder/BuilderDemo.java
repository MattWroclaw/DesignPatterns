package pl.sdacademy.designpatterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        final Player player = new Player.Builder().withHealth(100).withMana(20).build();
    }
}
