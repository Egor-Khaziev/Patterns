package Main.generative;

public class Main {

    public static void main(String[] args) {

        HumanFactory manFactory = new ManFactory();
        Human man1 = manFactory.GetHuman();
        System.out.println("Фабрика");
        System.out.println(man1.toString());

        HumanFactory womanFactory = new WomanFactory();
        Human woman1 = womanFactory.GetHuman();
        System.out.println("Фабрика");
        System.out.println(woman1.toString());


        System.out.println("\n\nПрототип");
        ManCloneFactory manCloneFactory = new ManCloneFactory(man1);

        Human man2 = manCloneFactory.cloneMan();

        System.out.println("first " + man1);
        System.out.println("second " + man2);
    }




}
