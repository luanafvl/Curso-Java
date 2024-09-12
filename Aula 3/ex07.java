package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, contador=0;

        System.out.println("Número: ");
        numero = sc.nextInt();

        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            if(numero == array[i]){
                contador++;
            }
        }

        if (contador == 0){
            array = new int[]{1, 2, 3, 4, 5, numero};
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}