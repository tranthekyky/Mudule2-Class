public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.Slow);
        fan1.setOn(false);
        fan1.setRadius(5);
        fan1.setColor("Blue");
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.Fast);
        fan2.setOn(true);
        fan2.setRadius(10);
        fan2.setColor("Red");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
