import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimesUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printPrimesUpToN(n);
    }
}
