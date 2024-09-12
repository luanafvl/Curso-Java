package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista: ");
        int tamanho = sc.nextInt();

        int[] array = new int[tamanho];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Posição %d: ", i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}