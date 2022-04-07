package Main.decorator;

public class Decorator implements Developer{

    Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }


    @Override
    public String iCan() {
        return developer.iCan();
    }
}
