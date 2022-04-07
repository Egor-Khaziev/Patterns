package Main.generative;

public class ManFactory implements HumanFactory {

    @Override
    public Human GetHuman() {
        return new Man();
    }
}
