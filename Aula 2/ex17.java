import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salario;

        Scanner sc = new Scanner(System.in);

        System.out.println("Salário: ");
        salario = sc.nextDouble();

        if (salario>=0 && salario<1000) {
            System.out.printf("Salário novo: R$%.2f", salario*1.1);
        } else if (salario>=1000) {
            System.out.printf("Salário novo: R$%.2f", salario*1.05);
        } else {
            System.out.println("Salário inválido.");
        }
    }
}