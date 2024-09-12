import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Salario: ");
        salario = sc.nextDouble();

        System.out.println(salario*1.15);
    }
}