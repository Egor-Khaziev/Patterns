package Main.decorator;

public class Senior extends  Decorator{

    public Senior(Developer developer) {
        super(developer);
    }

    public String iCanMore(){
        return " I am god of the Java.";
    }

    @Override
    public String iCan() {
        return super.iCan() + iCanMore();
    }
}
