package Main.generative;

public class Man implements Human{

    private int id;
    private String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Man() {
        this.id = 1;
        this.name = "bob";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object copy() {
        Man copy = new Man(id,name);
        return copy;
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                '}';
    }
}
