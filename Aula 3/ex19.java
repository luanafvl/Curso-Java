package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, contagemPrimos, contagemQnt=0;

        System.out.println("Informe o tamanho dos arrays: ");
        n = sc.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] arraySoma = new int[n];

        System.out.println("----Array 1----");
        for (int i = 0; i < n; i++) {
            System.out.printf("Numero %d: ", i+1, "\n");
            array1[i] = sc.nextInt();
        }
        System.out.println("----Array 2----");
        for (int i = 0; i < n; i++) {
            System.out.printf("Numero %d: ", i+1, "\n");
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arraySoma[i] = array1[i] + array2[i];
            System.out.println(arraySoma[i]);
        }
    }
}