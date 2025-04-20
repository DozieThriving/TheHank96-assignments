import java.util.Scanner;

public class PrimeNumb {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.printf("%d is not a prime number.%n", num);
            return;
        }
        if (num == 2) {
            System.out.printf("%d is a prime number.%n", num);
            return;
      }
        if (num % 2 == 0) {
            System.out.printf("%d is not a prime number.%n", num);
            return;
        }

       
        int sqrtNum = (int) Math.sqrt(num);
        int i = 3; 

        while (i <= sqrtNum) {
            if (num % i == 0) {
                System.out.printf("%d is not a prime number.%n", num);
                return; 
         }
            i= i + 1;
        }

      System.out.printf("%d is a prime number.%n", num);
      }
}