import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width : ");
        int width = input.nextInt();
        System.out.println("Enter Height : ");
        int height = input.nextInt();
        Rectangle rectangle = new Rectangle( width, height) ;
        System.out.println(rectangle.Display());
        System.out.println("Acreage = " + (rectangle.Acreage()));
        System.out.println("Perimeter = " + (rectangle.Perimeter()));


    }
}
