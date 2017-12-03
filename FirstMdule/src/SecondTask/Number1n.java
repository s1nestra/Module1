package SecondTask;
        import java.util.Random;
        import java.util.Scanner;

public class Number1n {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int NumberN = random.nextInt(100) + 1;
        int attempt = random.nextInt(1) + 10;
        while (attempt > 0) {
            attempt--;
            int userNum = scanner.nextInt();
            if (NumberN > userNum) {
                System.out.println("Введите больше");
            } else if (userNum > NumberN) {
                System.out.println("Введите меньшее");
            } else {
                System.out.println("Угадал");
                return;
            }
        }
        System.out.println("Проиграл");
    }
}
