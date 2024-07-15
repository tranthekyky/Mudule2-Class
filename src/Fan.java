public class Fan {
    //ĐỊnh nghĩa hằng số tĩnh để đại diện cho mức quạt
    public static final int  Slow = 1 ;
    public static final int  Medium = 2 ;
    public static final int  Fast = 3 ;
    // ĐỊnh nghiã thuộc tính quạt
    private int speed  ;
    private boolean on ;
    private double radius;
    private String color ;

    // Construstor Xaay dung cái quạt măcj định
    public Fan() {
        this.speed = Slow ;
        this.on = false ;
        this.radius = 5 ;
        this.color = "blue" ;
    }
    // Định nghĩa các phương thức getter và setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return on ;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // định nghĩa phương thức tostring để trả về thông tin quạt
    public String toString() {
        if (this.on) {
            return "Fan -- Speed : " + this.speed + ", radius : " + this.radius + ", color : " + this.color + ", Fan is the on.";
        }else {
            return "Fan -- Color : " + this.color + ", radius : " + this.radius + ", Fan is the off.";
        }
    }


}