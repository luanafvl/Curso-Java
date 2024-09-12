import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        num1 = sc.nextInt();

        for (int i = 2; i <= 4; i++) {
            System.out.println(num1*i);
        }
    }
}