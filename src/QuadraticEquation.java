public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    // Constructor để khởi tạo các hệ số a, b, c
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức để tính delta (b^2 - 4ac)
    public double getDelta() {
        return b * b - 4 * a * c;
    }

    // Phương thức để lấy hệ số a
    public int getA() {
        return a;
    }

    // Phương thức để lấy hệ số b
    public int getB() {
        return b;
    }

    // Phương thức để lấy hệ số c
    public int getC() {
        return c;
    }

    // Phương thức để tính nghiệm của phương trình
    public void solveEquation() {
        double delta = getDelta();

        if (delta < 0) {
            System.out.println("The equation has no solution");
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            System.out.println("The equation has one solution: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("The equation has two solutions: x1 = " + x1 + ", x2 = " + x2);
        }
    }


}


