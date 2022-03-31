package Main;

public class WomanCloneFactory {

    private Woman woman;

    public WomanCloneFactory(Woman  woman) {
        this.woman = woman;
    }

    Woman cloneWoman(){
        return woman;
    }
}
