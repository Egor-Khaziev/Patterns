package Main.observer;

import java.util.ArrayList;
import java.util.List;

public class TeamRole  implements Observed{

    List<String> roles = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addNewRole(String role){
        this.roles.add(role);
        warning();
    }

    public void removeRole(String role){
        this.roles.remove(role);
        warning();
    }

    @Override
    public void add(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void warning() {
        for (Observer o: this.subscribers) {
            o.handler(this.roles);
        }
    }
}
