import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 3 números: ");
        num1 = sc.nextDouble()*2;
        num2 = sc.nextDouble()*3;
        num3 = sc.nextDouble()*5;

        System.out.println((num1+num2+num3)/3);
    }
}