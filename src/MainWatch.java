import java.util.Scanner;

public class MainWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        System.out.println("Bấm 'Start' để bắt đầu bấm giờ !");
        String start = scanner.nextLine();
        stopWatch.start();
        System.out.println("Thời gian đang chạy....");
        System.out.println("Bấm 'Stop' để dừng ");
        String stop = scanner.nextLine();
        stopWatch.stop();
        System.out.println("Time = " + stopWatch.getElapsedTime() + " s");

    }
}
