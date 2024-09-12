package main;

import java.util.Scanner;

public class ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Informe a linha desejada: ");
        linha = sc.nextInt();
        System.out.println("Informe a coluna desejada: ");
        coluna = sc.nextInt();

        System.out.println(array[linha][coluna]);
    }
}