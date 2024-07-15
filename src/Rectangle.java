public class Rectangle {
    public int a;
    public int b;
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public double Acreage() {
        return a * b;
    }
    public double Perimeter() {
        return (a + b) * 2 ;
    }
    public String Display () {
        return "Retangle : Width = " + a + " Height = " + b;
    }
}
