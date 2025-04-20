import java.util.Scanner;

public class SumLoop {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   String reply;

  do {
      System.out.print("Enter the first integer: ");
      int num1 = input.nextInt();
      System.out.print("Enter the second integer: ");
      int num2 = input.nextInt();

      int sum = num1 + num2;
      System.out.println("Sum: " + sum);

      System.out.print("Do you want to perform the operation again? (yes/no):");
      reply = input.next();

        } while (reply.equalsIgnoreCase("yes")); 

 
}
}