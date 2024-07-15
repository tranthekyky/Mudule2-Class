public class MainEquation {
        public static void main(String[] args) {
            // Khởi tạo phương trình bậc hai với a = 1, b = -3, c = 2 (phương trình: x^2 - 3x + 2 = 0)
            QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
            QuadraticEquation equation2 = new QuadraticEquation(3, 6, -1);
            equation.solveEquation();
            equation2.solveEquation();
        }

}
