package Main.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handler(List<String> roles) {
        System.out.println("Hello " + name + ". Your teams have roles: \n" + roles + "\n");
    }
}
