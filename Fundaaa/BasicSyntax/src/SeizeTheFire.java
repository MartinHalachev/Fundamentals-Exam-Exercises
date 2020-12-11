import java.util.Scanner;

public class SeizeTheFire {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("#");
        int maxSize = Integer.parseInt(scanner.nextLine());
        int totalFire = 0;
        double effort = 0;
        System.out.println("Cells:");
        for (int i = 0; i < tokens.length; i++) {
            String[] token = tokens[i].split(" ");
            String type = token[0];
            int size = Integer.parseInt(token[2]);
            if (type.equals("High") && size >= 81 && size <= 125 && totalFire + size <= maxSize) {
                totalFire += size;
                effort += size * 0.25;
                System.out.println("- " + size);
            } else if (type.equals("Medium") && size >= 51 && size <= 80 && totalFire + size <= maxSize) {
                totalFire += size;
                effort += size * 0.25;
                System.out.println("- " + size);
            } else if (type.equals("Low") && size >= 1 && size <= 50 && totalFire + size <= maxSize) {
                totalFire += size;
                effort += size * 0.25;
                System.out.println("- " + size);
            }

        }
        System.out.printf("Effort: %.2f%n", effort);
        System.out.printf("Total Fire: %d", totalFire);
    }
}
