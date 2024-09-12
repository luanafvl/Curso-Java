import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;


        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        num1 = sc.nextInt();

        if (num1 % 3 == 0 && num1 % 5 == 0) {
            System.out.printf("%d é multiplo de 3 e 5", num1);
        }
    }
}