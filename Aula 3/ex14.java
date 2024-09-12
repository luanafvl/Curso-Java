package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        int numero1, numero2, aux;

        do {
            System.out.println("Informe o primeiro índice para a troca: ");
            numero1 = sc.nextInt();
            System.out.println("Informe o segundo índice para a troca: ");
            numero2 = sc.nextInt();
        } while (numero1 < 0 || numero1 > array.length || numero2 < 0 || numero2 > array.length);

        aux = array[numero1];
        array[numero1] = array[numero2];
        array[numero2] = aux;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
