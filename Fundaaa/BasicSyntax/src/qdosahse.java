import java.util.Scanner;

public class qdosahse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int snowballValue = 0;

        for (int i = 0; i < n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            int currentBest = 0;
            int divide = snowballSnow / snowballTime;
            for (int j = 0; j < snowballQuality; j++) {
                currentBest = divide * divide;
            }
            if (currentBest >= snowballValue){
                snowballValue = currentBest;
            }
        }
        System.out.println(snowballValue);
    }
}
