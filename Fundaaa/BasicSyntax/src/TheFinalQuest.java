import java.util.Scanner;

public class TheFinalQuest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double totalBonus = 0;
        int student = 0;
        for (int i = 0; i < studentsCount; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double currentBestBonus = (double) attendance / lecturesCount * (5 + bonus);
            if (totalBonus < currentBestBonus){
                totalBonus = currentBestBonus;
            }
            if (student < attendance){
                student = attendance;
            }

            }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(totalBonus));
        System.out.printf("The student has attended %d lectures.", student);
    }
}
