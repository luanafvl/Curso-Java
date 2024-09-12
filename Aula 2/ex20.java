import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Idade: ");
        idade = sc.nextInt();

        System.out.println("Classificação:");
        if (idade > 0 && idade<10) {
            System.out.println("Mirim.");
        } else if (idade >= 10 && idade < 14) {
            System.out.println("Infantil.");
        } else if (idade >= 14 && idade < 18) {
            System.out.println("Juvenil.");
        } else if (idade >= 18) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idade inválida");
        }
    }
}