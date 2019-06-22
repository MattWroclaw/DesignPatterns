package pl.sdacademy.designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;


// metoda LAZY

// jest dobry dla 1wątkowych, ale złym dla wielowątkowych
public class AppConections {
    private List<String> connectedUsers;
    private int currentConnectionsNum = 0;
    private long timeuot;

    private static AppConections appConections;

    private AppConections(){
        connectedUsers = new ArrayList<>();
    }

    public List<String> getConnectedUsers() {
        return connectedUsers;
    }

    public int getCurrentConnectionsNum() {
        return currentConnectionsNum;
    }

    public long getTimeuot() {
        return timeuot;
    }

    public static AppConections getAppConections() {
        return appConections;
    }

    public void connectedUser(final String username){
        connectedUsers.add(username);

    }
    public static AppConections getInstance(){
        if (appConections ==null){
           appConections = new AppConections();
            System.out.println("Initialized AppConnections");
        }
        return appConections;
    }


}
