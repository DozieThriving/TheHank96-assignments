import java.util.Scanner;
public class Factorial{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scanner.nextInt();
    
    long factorial = 1;
    int i = num;
    
    while (i > 1) {
        factorial = factorial * i;
        i = i - 1;
    }
    
    System.out.printf("Factorial of %d is %d%n", num, factorial);
}

}