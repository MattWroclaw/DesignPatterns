package pl.sdacademy.designpatterns.builder;

import java.util.List;

public class Player {
    private int health;
    private int mana;
    private String nick;
    private List<String > friends;
    private int level;


    //konstruktor prywatny
    private Player(int health, int mana, String nick, List<String> friends, int level) {
        this.health = health;
        this.mana = mana;
        this.nick = nick;
        this.friends = friends;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", mana=" + mana +
                ", nick='" + nick + '\'' +
                ", friends=" + friends +
                ", level=" + level +
                '}';
    }
    //klasa w klasie musi być statyczna, możemy dostać się do pól prywatnych klasy Player
    public static class Builder{
        private int health;
        private int mana;
        private String nick;
        private List<String > friends;
        private int level;

        public Builder withNick(String nick){
            this.nick = nick; //this dotyczy klasy Builder
            return this;
        }

        public Builder withHealth(int health){
            this.health =  health;
            return this;
        }

        public Builder withMana(int mana){
            this.mana = mana;
            return this;
        }

        public Builder withFriends(List<String > friends){
            this.friends = friends;
            return this;
        }

        public Builder withLevel(int level){
            this.level = level;
            return this;
        }


        //argumenty muszą być w tej kolejności co pola
        public Player build(){
            return new Player(health, mana, nick, friends, level);
        }


    }
}
