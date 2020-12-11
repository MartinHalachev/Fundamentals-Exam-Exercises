import java.math.BigDecimal;
import java.util.Scanner;

public class ITUKSAMQDOSAN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        int currentBestSize = 0;
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            int size = (int)(Math.PI * radius * radius * height);

            if (size >= currentBestSize) {
                currentBestSize +=size;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);

    }
}


