package Main.decorator;

public class Main {

    public static void main(String[] args) {

        Developer developer = new Senior(new Middle(new Junior()));

        System.out.println(developer.iCan());
    }



}
