import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}