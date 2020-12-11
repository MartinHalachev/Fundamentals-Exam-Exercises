import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        int[] liftState = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < liftState.length; i++) {

            int peopleNeeded = 4 - liftState[i];
            if (peopleWaiting < peopleNeeded ) {
                liftState[i] += peopleWaiting;
            } else {
                liftState[i] += peopleNeeded;
            }
            peopleWaiting -= peopleNeeded;

        }
        if (liftState[liftState.length - 1] < 4) {
            System.out.println("The lift has empty spots!");
        }
        if (peopleWaiting > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
        }
        for (Integer lift : liftState) {
            System.out.print(lift + " ");
        }

    }

    private static List parseLineOfNumbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        String input = scanner.nextLine();
        String[] numbersAsString = input.split(" ");
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers.add(Integer.parseInt(numbersAsString[i]));
        }
        return numbers;
    }
}
