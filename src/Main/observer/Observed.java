package Main.observer;

public interface Observed {
    public void add(Observer observer);
    public void remove(Observer observer);
    public void warning();
}
