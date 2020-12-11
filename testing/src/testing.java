import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        String[] elementsSecondline = scanner.nextLine().split(" ");
        String [] output = new String[elements.length];
        for (int n = 0; n < elementsSecondline.length; n++) {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i].equals(elementsSecondline[n])){
                    output[i] += elements[i] + " ";
                }
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
