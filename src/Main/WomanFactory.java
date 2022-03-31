package Main;

public class WomanFactory implements HumanFactory {
    @Override
    public Human GetHuman() {
        return new Woman();
    }
}
