package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        int []cores = new int[4];

        int contB=0, cor = 0;

        Scanner sc = new Scanner(System.in);

        // Coletando as cores
        System.out.println("Cores");
        for (int i = 0; i < 4; i++) {
            do {
                cores[i] = sc.nextInt();
            } while (cores[i] < 0 || cores[i] > 9);
        }
        for (int i = 0; i < 4; i++) {
             for (int j = i + 1; j < 4; j++) {
                 // Verificando se a ordem é de uma coral verdadeira
                 if (j == i+2 && cores[i]==cores[j]) {
                     contB++;
                 }
             }
        }

        for (int i = 1; i < 4; i++) {
            // Verificando quantas cores diferentes tem
            if (cores[i] != cores[i-1]) {
                cor++;
            }
        }
        // Se tiver 3 cores diferentes e a ordem for de uma coral, mostra V
        if (contB==1 && cor==3) {
            System.out.println("V");
        // Senão, mostra F
        } else {
            System.out.println("F");
        }
    }
}
