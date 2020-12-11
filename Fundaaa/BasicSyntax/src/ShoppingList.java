import java.util.*;

class ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);
        double numbersSum = 0;
        boolean isAbove = true;

        for (int i = 0; i < numbers.size(); i++) {
            numbersSum += numbers.get(i);
        }

        List<Integer> output = new ArrayList<>();

        double average = numbersSum / numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average) {
                output.add(numbers.get(i));
            }
        }
        if (output.size() < 1){
            isAbove = false;
        }
        Collections.sort(output);
        Collections.reverse(output);
        if (!isAbove){
            System.out.println("No");
        }
        for (int i = 0; i < output.size(); i++) {
            if (i < 5) {
                System.out.print(output.get(i) + " ");
            }else{
                break;
            }
        }


    }

    private static List<Integer> parseLineOfNumbers(Scanner scanner) {

        String input = scanner.nextLine();
        String[] numbersAsString = input.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers.add(Integer.parseInt(numbersAsString[i]));
        }
        return numbers;
    }
}