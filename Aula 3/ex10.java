package main;

import java.util.Objects;
import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior=0, menor=0;

        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            if (i==0){
                maior = array[i];
                menor = array[i];
            } else if (maior<array[i])
                maior = array[i];
            else if(menor>array[i])
                menor = array[i];
        }
        System.out.printf("Menor: " + menor + "\nMaior: " + maior);
    }
}