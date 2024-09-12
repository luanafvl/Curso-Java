package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];

        System.out.println("Primeiro valor do array: ");
        array[0] = sc.nextInt();
        System.out.println("Último valor do array: ");
        array[6] = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i!=6)
                array[i] = array[0]+i;
            System.out.println(array[i]);
        }
    }
}