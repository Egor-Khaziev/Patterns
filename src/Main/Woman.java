package Main;

public class Woman implements Human{

    private int id;
    private String name;

    public Woman() {
        this.id = 1;
        this.name = "Sharli";
    }

    public Woman(int id, String name) {
        this.id = id;
        this.name = name;
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
        Woman copy = new Woman(id,name);
        return copy;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                '}';
    }
}
