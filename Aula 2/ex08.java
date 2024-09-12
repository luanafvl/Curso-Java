import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dias;
        double valorDia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dias trabalhados: "); dias = sc.nextInt();
        System.out.println("Valor recebido por dia: "); valorDia = sc.nextDouble();

        System.out.printf("Salário: R$%.2f", dias*valorDia);
    }
}