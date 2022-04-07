package Main.decorator;

public class Middle  extends Decorator{

    public Middle(Developer developer) {
        super(developer);
    }

    public String iCanMore(){
        return " I can write test.";
    }

    @Override
    public String iCan() {
        return super.iCan() + iCanMore();
    }
}
