// Java program to count the number of factors of a given number using loops and conditional statements.
    
import java.util.Scanner;
public class NoOfFactors {
    static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = countFactors(n);
        System.out.println("Number of factors: " + result);
    }
}
