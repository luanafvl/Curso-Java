import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double peso, altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Peso: "); peso = sc.nextDouble();
        System.out.println("Altura"); altura = sc.nextDouble();

        System.out.println(peso/(altura*altura));
    }
}