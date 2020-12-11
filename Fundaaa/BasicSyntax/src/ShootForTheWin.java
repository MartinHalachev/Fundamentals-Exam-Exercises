import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        while (!command.equals("End")){
            int targets = Integer.parseInt(command);
            for (int i = 0; i < sequence.length ; i++) {
                if (sequence[targets] > sequence.length){
                    System.out.println("invalid");
                }else{
                    sequence[targets] = -1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence + " ");
        }
    }
}
