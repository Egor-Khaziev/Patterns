package Main;

public class ManCloneFactory {

    private Human man;

    public ManCloneFactory(Human  man) {
        this.man = man;
    }

    Human cloneMan(){
        return man;
    }
}
