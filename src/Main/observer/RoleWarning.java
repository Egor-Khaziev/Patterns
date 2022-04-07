package Main.observer;

public class RoleWarning {
    public static void main(String[] args) {
        TeamRole teamRole = new TeamRole();

        teamRole.addNewRole("code review");
        teamRole.addNewRole("write java");

        Observer observer1 = new Subscriber("first man");
        Observer observer2 = new Subscriber("second man");

        teamRole.add(observer1);
        teamRole.add(observer2);

        teamRole.addNewRole("wash floor");
        teamRole.removeRole("wash floor");
    }
}
