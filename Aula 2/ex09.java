import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double preco;

        Scanner sc = new Scanner(System.in);

        System.out.println("Preço: ");
        preco = sc.nextDouble();

        System.out.printf("Novo valor: R$%.2f", preco*0.9);
    }
}