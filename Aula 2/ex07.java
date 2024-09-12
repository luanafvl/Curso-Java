import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        num1 = sc.nextInt();

        System.out.printf("\nAntecessor: %d\nSucessor: %d", num1-1, num1+1);
    }
}