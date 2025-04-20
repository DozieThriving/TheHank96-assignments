
import java.util.Scanner;

    public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int firstNumber = scanner.nextInt();
        int largest = firstNumber;
        int smallest = firstNumber;

        String decision = "yea";
        
        while (decision.equalsIgnoreCase("yea")) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number > largest){
            largest = number;
      }
            if (number < smallest){
             smallest = number;
        }
            
            System.out.print("you want continue? (yea/nay): ");
            decision = scanner.next();
        }
        
        System.out.printf("Largest number is: %d%n", largest);
        System.out.printf("Smallest number is:%d%n", smallest);
    }
}