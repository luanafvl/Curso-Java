package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Posição [%d][%d] = ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}