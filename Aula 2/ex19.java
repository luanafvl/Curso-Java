import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double []numeros = new double[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("Número %d: ", i + 1);
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            for (int j =0 ; j < 3 - 1 - i; j++) {
                if (numeros[j] > numeros[j+1]) {
                    double aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
    }
}