import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Idade: ");
        idade = sc.nextInt();

        System.out.println(idade*365);
    }
}