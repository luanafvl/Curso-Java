import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println(num1+num2+num3);
    }
}