package main;

import java.util.Objects;
import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String numero;
        int contador=0;

        System.out.println("Número: ");
        numero = sc.nextLine();

        String[] array = new String[] {"1", "2", "3", "4", "5", "6", "7", "8"};

        for (int i = 0; i < array.length; i++) {
            if(Objects.equals(numero, array[i])) {
                contador++;
                array[i] = null;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i]);
            }
        }
        System.out.println("Quantidade de ocorrências do número: " + contador);
    }
}