import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 2 numeros: ");
        num1 = sc.nextInt();
        
        if (num1 % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
}