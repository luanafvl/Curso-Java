package main;

import java.util.Objects;
import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.println("Número: ");
        numero = sc.nextDouble();

        double[] array = new double[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = numero;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
