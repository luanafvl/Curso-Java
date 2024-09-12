import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso;

        Scanner sc = new Scanner(System.in);

        System.out.println("Peso em kg: ");
        peso = sc.nextDouble();

        System.out.printf("Peso em libras: %.2f", peso*2.20462);
    }
}