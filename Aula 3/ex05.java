package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma=0, tamanho;

        System.out.println("Informe o tamanho da lista: ");
        tamanho = sc.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Posição %d: ", i);
            array[i] = sc.nextInt();
            soma += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Soma dos valores: " + soma);
    }
}
